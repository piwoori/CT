# [level1] 정수 제곱근 판별 - 12934

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12943)

### 분류
- 제곱근

### 문제 요약
- 1이상, 50000000000000 이하인 양의 정수 매개변수
- n이 양의 정수 x의 제곱이라면 x+1의 제곱 리턴
- n이 양의 정수 x의 제곱이 아니라면 -1 리턴

### 풀이 아이디어
- Long 변수 x에 (long) Math.sqrt(n) 대입
- x * x == n 이면 (x + 1) * (x + 1) 리턴
- 아닐 시 -1 리턴