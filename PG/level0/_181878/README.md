# [level 0] 원하는 문자열 찾 - 181878

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181878)

### 분류
- 문자열 비교

### 문제 요약
- 알파벳으로 이루어진 문자열 myString과 pat 매개변수
- myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0 리턴
- 알파벳 대문자와 소문자는 구분하지 않음

### 풀이 아이디어
- 문자열.lower() in 문자열.lower() 으로 불리언 값 얻은 뒤 (int)로 형 변환