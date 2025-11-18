# [bronze 1] 뒤집힌 덧셈 - 1357

[문제 링크](https://www.acmicpc.net/problem/1357)

### 분류
- 메소드

### 문제 요약
- 1,000 이하의 정수 X, Y 입력
- 모든 자리수를 역순으로 만드는 메소드 Rev() 선언
- Rev(Rev(X) + Rev(Y)) 출력

### 풀이 아이디어
- 방법 1: StringBuilder 통해 reverse() 이용
- 방법 2: % 10 이용