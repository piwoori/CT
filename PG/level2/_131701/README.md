# [level2] 연속 부분 수열 합의 개수 - 131701

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131701)

### 분류
- Set

### 문제 요약
- 원형 수열의 모든 원소를 담은 배열 elements 매개변수
  - 3 ≤ elements의 길이 ≤ 1,000
  - 1 ≤ elements의 원소 ≤ 1,000
- 원형 수열이란 일반적인 수열에서 처음과 끝이 연결된 형태의 수열
- 원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수

### 풀이 아이디어
- 정수 변수 n을 elements.length로 초기화
- int[] list를 n * 2 크기로 초기화
- 정수 변수 i가 0부터 n - 1까지 도는 반복문 실행
  - list[i]와 list[i + n]에 elements[i] 대입
- Set<Integer> set을 HashSet 구현체로 초기화
- 정수 변수 len이 1부터 n까지 도는 반복문 실행
  - 정수 변수 start가 0부터 n - 1까지 도는 반복문 실행
    - 연속 부분의 수열 합을 나타내는 정수 변수 sum을 0으로 초기화
    - 정수 변수 k가 start부터 len + start - 1까지 도는 반복문 실행
      - sum에 list[k] 더함
    - set.add(sum) 실행
- set.size()로 개수 리턴