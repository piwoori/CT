# [level1] 두 정수 사이의 합 - 12912

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12912)

### 분류
- 정수
- 형변환

### 문제 요약
- 두 정수 a, b 매개변수
  - a와 b는 -10,000,000 이상 10,000,000 이하
- a와 b 사이에 속한 모든 정수의 합 리턴

### 풀이 아이디어
- 정수 변수 max를 Math.max(a, b)로 초기화
- 정수 변수 min을 Math.min(a, b)로 초기화
- ((long)(min + max) * (max - min + 1)) / 2 리턴
  - ⭐️ long으로의 형 변화는 * 연산 전에 해야 안 터짐 ⭐️