# [level1] [PCCE 기출문제] 9번 / 이웃한 칸 - 250125

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/250125)

### 분류
- 이차원 배열

### 문제 요약
- 보드의 각 칸에 칠해진 색깔 이름이 담긴 이차원 문자열 리스트 board와 고른 칸의 위치를 나타내는 두 정수 h, w 매개변수
  - 1 ≤ board의 길이 ≤ 7
    - board의 길이와 board[n]의 길이는 동일
  - 0 ≤ h, w < board의 길이
  - 1 ≤ board[h][w]의 길이 ≤ 10
    - board[h][w]는 영어 소문자로만 이루어져 있음
- board[h][w]와 이웃한 칸들 중 같은 색으로 칠해져 있는 칸의 개수 리턴

### 풀이 아이디어
- 같은 색으로 칠해져 있는 칸의 개수를 나타내는 정수 변수 answer을 0으로 초기회
- 세로 상의 이동을 나타낼 정수 배열 dh을 {-1, 1, 0, 0}로 초기화
- 가로 상의 이동을 나타낼 정수 배열 dw를 {0, 0, -1, 1}로 초기화
- 정수 변수 i가 0부터 4전까지 도는 for문 실행
  - 정수 변수 nh를 h + dh[i]로 초기화
  - 정수 변수 nw를 w + dw[i]로 초기화
  - 보드판을 벗어나지 않는 nh >= 0 && nh < board.length && nw >= 0 && nw < board[0].length 조건식 만족 시 
    - board[nh][nw].equals(board[h][w]) 조건식 만족 시 answer++ 실행
- answer 리턴