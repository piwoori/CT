# [level3] 이중우선순위큐 - 42628

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42628)

### 분류
- TreeMap

### 문제 요약
- 이중 우선순위 큐가 할 연산 operations 매개변수
  - operations는 길이가 1 이상 1,000,000 이하인 문자열 배열
  - operations의 원소는 큐가 수행할 연산을 나타냄
  - 원소는 “명령어 데이터” 형식
- 이중 우선순위 큐는 다음 연산을 할 수 있는 자료구조를 말함
  - I 숫자: 큐에 주어진 숫자를 삽입
  - D 1: 큐에서 최댓값을 삭제
  - D -1: 큐에서 최솟값을 삭제
- 빈 큐에 데이터를 삭제하라는 연산이 주어질 경우, 해당 연산은 무시
- 모든 연산을 처리한 후 큐가 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값] 리턴

### 풀이 아이디어
- TreeMap<Integer, Integer> map 초기화
- 문자열 변수 op가 operations을 도는 for문 실행
  - 문자열 배열 s을 op.split(" ")로 초기화
  - 문자열 변수 command를 s[0]로 초기화
  - 정수 변수 num를 Integer.parseInt(s[1])로 초기화
  - command.equals("I")의 조건식을 만족하면
    - map.put(num, map.getOrDefault(num, 0) + 1) 실행
    - 없으면 0 + 1
    - 있으면 기존 값 + 1
  - 만족하지 않으면(== "D"이면)
    - map.isEmpty()의 조건식 만족 시 continue
    - 정수 변수 target 초기화
    - num == 1의 조건식 만족 시
      - target에 map.lastKey() 대입
      - TreeMap은 key 기준 오름차순 정렬되기에 최댓값 삭제
    - 아닐 시 
      - target에 map.firstKey() 대입
      - TreeMap은 key 기준 오름차순 정렬되기에 최솟값 삭제
    - map.get(target) == 1)의 조건식 만족 시
      - map.remove(target) 실행
      - 하나이니까 아예 삭제
    - 아닐 시
      - map.put(target, map.get(target) - 1) 실행
      - 여러 개이니까 개수 1 감소
- map.isEmpty()의 조건식 만족하면
  - new int[]{0, 0} 리턴
- new int[]{map.lastKey(), map.firstKey()} 리턴