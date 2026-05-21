# [level1] 문자열 다루기 기본 - 12918

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12918)

### 분류
- 문자열

### 문제 요약
- 문자열 s 매개변수
  - s는 길이 1 이상, 길이 8 이하인 문자열
  - s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 구성
- s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 여부 리턴

### 풀이 아이디어
- 불리언 변수 answer를 true로 초기화
- s.length() == 4의 조건식 만족하면
  - 정수 변수 i가 0부터 s.length() - 1까지 도는 반복문 실행
    - 문자 변수 c를 s.charAt(i)로 초기화
    - !Character.isDigit(c)의 조건식을 만족하면 answer를 false로 설정
- s.length() == 6의 조건식 만족하면 
  -  정수 변수 i가 0부터 s.length() - 1까지 도는 반복문 실행
    - 문자 변수 c를 s.charAt(i)로 초기화
    - !Character.isDigit(c)의 조건식을 만족하면 answer를 false로 설정
- 그 외는 answer를 false로 설정
- answer 리턴