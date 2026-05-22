# [level1] 행렬의 덧셈 - 12950

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12950)

### 분류
- 2차원 배열

### 문제 요약
- 2개의 행렬 arr1과 arr2 매개변수
  - 행렬 arr1, arr2의 행과 열의 길이는 500 이하
- 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과
- 행렬 덧셈의 결과 리턴

### 풀이 아이디어
- 정수 변수를 원소로 하는 2차원 배열 answer를 new int[arr1.length][arr1[0].length] 로 초기화
- 정수 변수 i가 0부터 arr1.length - 1까지 도는 for문 실행
  - 정수 변수 j가 0부터 arr1[i].length - 1까지 도는 for문 실행
    - answer[i][j]에 arr1[i][j] + arr2[i][j] 대입
- answer 리탄