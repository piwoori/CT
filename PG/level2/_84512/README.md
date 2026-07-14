# [level2] 모음사전 - 84512

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/84512)

### 분류
- 배열
- dfs

### 문제 요약
- 단어 하나 word 매개변수
  - word의 길이는 1 이상 5 이하
  - word는 알파벳 대문자 'A', 'E', 'I', 'O', 'U'로만 이루어져 있음
- 이 단어가 사전에서 몇 번째 단어인지 리턴

### 풀이 아이디어
- 문자 배열 vowel을 {'A', 'E', 'I', 'O', 'U'}로 초기화
- 현재 몇 번째까지 탐색했는지를 나타내는 정수 변수 count를 0으로 초기화
- 목표 단어가 몇 번째인지를 나타내는 정수 변수 answer를 0으로 초기화
- 문자열 target 초기화
- 정수를 반환하고 문자열 word를 매개변수로 하는 solution 메소드 정의
  - target에 word 대입
  - dfs("") 실행
  - answer 리턴
- 아무 것도 반환하지 않고 문자열 str을 매개변수로 하는 dfs 메소드 정의
  - !str.equals("") 조건식 만족 시 
    - count++ 실행
    - str.equals(target) 조건식 만족 시
      - answer에 count 대입한 뒤 return 실행
  - str.length() == 5 조건식 만족 시 return 실행
  - 문자 c가 vowel을 도는 for문 실행
    - dfs(str + c) 실행