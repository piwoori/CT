# [level2] 행렬의 곱셈 - 12949

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12949)

### 분류
- 행렬

### 문제 요약
- 2차원 행렬 arr1과 arr2 매개변수
  - 행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하
  - 행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수
  - 곱할 수 있는 배열만 주어짐
- arr1에 arr2를 곱한 결과 리턴

### 풀이 아이디어
- 행을 나타내는 정수 변수 row를 arr1.length로 초기화
- 열을 나타내는 정수 변수 col을 arr2[0].length로 초기화
- 공통 차원을 나타내는 정수 변수 mid를 arr2.length로 초기화
  - arr1[0].length로 해도 됨
- 이차원 배열 answer를 row, col 크기로 초기화
- 정수 변수 i가 0부터 row - 1까지 도는 for문 실행
  - 정수 변수 j가 0부터 col - 1까지 도는 for문 실행
    - 정수 변수 k가 0부터 mid - 1까지 도는 for문 실행
      - answer[i][j] += arr1[i][k] * arr2[k][j] 실행
        - 공통 차원을 순회
- answer 리턴