# [level2] 귤 고르기 - 138476

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/138476)

### 분류
- HashMap

### 문제 요약
- 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine 매개변수
  - 1 ≤ k ≤ tangerine의 길이 ≤ 100,000
  - 1 ≤ k ≤ tangerine의 길이 ≤ 100,000
- 수확한 귤 중 'k'개를 골라 상자 하나에 담아 판매
- 귤을 크기별로 분류했을 때 서로 다른 종류의 수를 최소화
- 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값 리턴

### 풀이 아이디어
- Map<Integer, Integer> map을 new HashMap<>() 구현체로 초기화
- 정수 변수 num이 map을 도는 반복문 실행
  - map.put(num, map.getOrDefault(num, 0) + 1) 실행
    - key인 num이 존재하면 기존 값(num의 value)에 1을 더하고, 없으면 0을 기준으로 1을 더해 1을 넣음
- List<Integer> list을 new ArrayList<>(map.values())로 초기화
  - map의 기존 값들 이용
- list.sort(Collections.reverseOrder())으로 내림차순 정렬
  - 종류 수 최소화 하기 위해 많이 있는 것부터 고름
- 정수 변수 cnt와 answer를 모두 0으로 초기화
- 정수 변수 num이 list를 도는 반복문 실행
  - cnt += num, answer++ 실행
  - cnt >= k의 조건식을 만족하면, break 실행으로 반복문 종료
- 최종적으로 answer 리턴