# [level1] 약수의 개수와 덧셈 - 77884

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/77884)

### 분류
- 약수

### 문제 요약
- 두 정수 left와 right 매개변수
  - 1 ≤ left ≤ right ≤ 1,000
- left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수 리턴

### 풀이 아이디어
- 정답을 나타내는 정수 변수 answer을 0으로 초기화
- 정수 변수 i가 left부터 right까지 도는 for문 실행
  - i의 약수 개수를 나타내는 정수 변수 count를 0으로 초기화
  - 정수 변수 j가 1부터 i까지 도는 for문 실행
    - i % j == 0의 조건식을 만족하면 count++ 실행
  - count % 2 == 0의 조건식을 만족하면 answer에 i 더하기
  - 아닐 시 answer에 i 빼기
- answer 리턴