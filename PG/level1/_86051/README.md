# [level1] 없는 숫자 더하기 - 86051

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/86051)

### 분류
- 배열

### 문제 요약
- 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers 매개변수(1 ≤ numbers의 길이 ≤ 9)
- numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수 리턴

### 풀이 아이디어
- 0부터 9까지 더한 정수 변수 sum을 45로 초기화
- int num : numbers 조건식의 반복문 실행
  - sum에 num 빼기 실행
- sum 리턴