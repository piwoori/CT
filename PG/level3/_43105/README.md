# [level3] 정수 삼각형 - 43105

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/43105)

### 분류
- 삼각형 DP

### 문제 요약
- 삼각형의 정보가 담긴 2차원 배열 triangle 매개변수
    - k삼각형의 높이는 1 이상 500 이하
    - 삼각형을 이루고 있는 숫자는 0 이상 9,999 이하의 정수
- 아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능
- 거쳐간 숫자의 최댓값 리턴

### 풀이 아이디어
- i가 1부터 triangle.length -1까지 도는 반복문 실행
  - j가 0부터 i까지 도는 이중 반복문 실행
    - j == 0의 조건식 만족하면, triangle[i][j]에 triangle[i-1][j] 더하기
    - j == i의 조건식 만족하면, triangle[i][j]에 triangle[i-1][j-1] 더하기
    - 그 외는, triangle[i][j]에 Math.max(triangle[i-1][j-1], triangle[i-1][j]) 더하기
- 정수 변수 answer를 0으로 초기화
- 정수 변수 num이 마지막 줄인 triangle[triangle.length-1]으로 도는 반복문 실행
  - answer에 Math.max(answer, num) 대입
- answer 반환
    