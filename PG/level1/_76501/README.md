# [level1] 음양 더하기 - 76501

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/76501)

### 분류
- 배열

### 문제 요약
- 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs 매개변수
  - absolutes의 길이는 1 이상 1,000 이하
  - absolutes의 모든 수는 각각 1 이상 1,000 이하
  - signs의 길이 == absolutes의 길이
  - signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미
- n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x 리턴
- 실제 정수들의 합 리턴

### 풀이 아이디어
- 합을 나타내는 정수 변수 answer을 0으로 초기화
- i가 0부터 absolutes.length -1까지 도는 반복문 실행
  - signs[i] 조건식을 만족하면, answer += absolutes[i] 실행
  - 아닐 시, answer -= absolutes[i] 실행
- 반복문 종료 후 answer 리턴