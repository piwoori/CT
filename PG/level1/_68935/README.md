# [level1] 3진법 뒤집기 - 68935

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/68935)

### 분류
- 진법

### 문제 요약
- 자연수 n 매개변수
    - n은 1 이상 100,000,000 이하인 자연수
- n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수

### 풀이 아이디어
- 문자열 tenary를 Integer.toString(n, 3)로 초기화
- 문자열 reversed를 new StringBuilder(tenary).reverse().toString()로 초기화
  - 문자열을 여러 번 이어붙이기에 StringBuilder 이용
- Integer.parseInt(reversed, 3) 리턴