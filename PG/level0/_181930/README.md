# [level 0] 주사위 게임 2 - 181930

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181930)

### 분류
- 조건문

### 문제 요약
- 정수 a, b, c 매개변수
- 세 숫자가 모두 다르다면 a + b + c 리턴
- 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 ) 리턴
- 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 ) 리턴

### 풀이 아이디어
- if - elif문 이용
- if-if는 독립적 실행, if-elif는 종속적 실행