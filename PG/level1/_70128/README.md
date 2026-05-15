# [level1] 내적 - 70128

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/70128)

### 분류
- 배열

### 문제 요약
- 길이가 같은 두 1차원 정수 배열 a, b 매개변수
  - , b의 길이는 1 이상 1,000 이하
  - a, b의 모든 수는 -1,000 이상 1,000 이하
-  a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
- a와 b의 내적 리턴

### 풀이 아이디어
- 정수 변수 answer를 0으로 초기화
- 정수 변수 i가 0부터 a.length - 1까지 도는 반복문 실행
  - answer에 a[i] * b[i] 더하기
- answer 리턴