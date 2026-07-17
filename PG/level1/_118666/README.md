# [level1] 성격 유형 검사하기 - 118666

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/118666)

### 분류
- HashMap
- 배열

### 문제 요약
- 질문마다 판단하는 지표를 담은 1차원 문자열 배열 survey와 검사자가 각 질문마다 선택한 선택지를 담은 1차원 정수 배열 choices 매개변수
  - 1 ≤ survey의 길이 ( = n) ≤ 1,000
    - survey의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나
    - survey[i]의 첫 번째 캐릭터는 i+1번 질문의 비동의 관련 선택지를 선택하면 받는 성격 유형을 의미
    - survey[i]의 두 번째 캐릭터는 i+1번 질문의 동의 관련 선택지를 선택하면 받는 성격 유형을 의미
  - choices의 길이 = survey의 길이
    - choices[i]는 검사자가 선택한 i+1번째 질문의 선택지를 의미
    - 1 ≤ choices의 원소 ≤ 7
    - choices의 뜻
      - 1: 매우 비동의 -> 3점
      - 2: 비동의 -> 2점
      - 3: 약간 비동의 -> 1점
      - 4: 모르겠음 -> 0점
      - 5: 약간 동의 -> 1점
      - 6: 동의 -> 2점
      - 7:매우 동의 -> 3점
- 성격 유형 검사는 다음과 같은 4개 지표로 성격 유형을 구분
  - 1번 지표: 라이언형(R), 튜브형(T)
  - 2번 지표: 콘형(C), 프로도형(F)
  - 3번 지표: 제이지형(J), 무지형(M)
  - 4번 지표: 어피치형(A), 네오형(N)
- 4개의 지표가 있으므로 성격 유형은 총 16(=2 x 2 x 2 x 2)가지가 나올 수 있음
- 각 질문은 1가지 지표로 성격 유형 점수를 판단
- 검사 결과는 모든 질문의 성격 유형 점수를 더하여 각 지표에서 더 높은 점수를 받은 성격 유형이 검사자의 성격 유형이라고 판단
- 하나의 지표에서 각 성격 유형 점수가 같으면, 두 성격 유형 중 사전 순으로 빠른 성격 유형을 검사자의 성격 유형이라고 판단
- 검사자의 성격 유형 검사 결과를 지표 번호 순서대로 리턴

### 풀이 아이디어
- Map<Character, Integer> map을 HashMap 구현체로 초기화
- 문자 배열 types를 {'R','T','C','F','J','M','A','N'}로 초기화
- 문자 c가 types를 도는 for문 실행
  - map.put(c, 0) 실행
- 정수 변수 i가 0부터 survey.length 전까지 도는 for문 실행
  - 문자 left를 survey[i].charAt(0)로 초기화
  - 문자 right를 survey[i].charAt(1)로 초기화
  - choices[i] < 4 조건식 만족 시
    - map.put(left, map.get(left) + (4 - choices[i])) 실행
  - choices[i] > 4 조건식 만족 시
    - map.put(right, map.get(right) + (choices[i] - 4)) 실행
- StringBuilder sb 초기화
- sb.append(map.get('R') >= map.get('T') ? 'R' : 'T') 실행
- sb.append(map.get('C') >= map.get('F') ? 'C' : 'F') 실행
- sb.append(map.get('J') >= map.get('M') ? 'J' : 'M') 실행
- sb.append(map.get('A') >= map.get('N') ? 'A' : 'N') 실행
- sb.toString() 리턴