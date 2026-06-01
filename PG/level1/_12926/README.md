# [level1] 시저 암호 - 12926

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120926)

### 분류
- 문자

### 문제 요약
- 문자열 s와 거리 n 매개변수
  - s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있음
  - s의 길이는 8000이하
  - n은 1 이상, 25이하인 자연수
- 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 함
- 공백은 아무리 밀어도 공백
- s를 n만큼 민 문자열 리턴

### 풀이 아이디어
- StringBuilder sb 초기화
- 정수 변수 i가 0부터 s.length() 전까지 도는 for문 실행
  - 문자 변수 c를 s.charAt(i)로 초기화
  - c == ' '의 조건식 만족 시 sb.append(' ') 실행
  - c >= 'a' && c <= 'z'의 조건식 만족 시
    - sb.append((char)((c - 'a' + n) % 26 + 'a')) 실행
  - c >= 'A' && c <= 'Z'의 조건식 만족 시
    - sb.append((char)((c - 'A' + n) % 26 + 'A')) 실행
- sb.toString() 리턴