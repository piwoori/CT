# [level0] 직사각형 넓이 구하기 - 120860

[문제 링크](https://www.acmicpc.net/problem/120860)

### 분류
- 2차원 배열

### 문제 요약
- 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots 매개변수
- 직사각형의 넓이 리턴

### 풀이 아이디어
- max() min() 이용
- 가로 길이 (max(dots)[0] - min(dots)[0])
- 세로 길이 (max(dots)[1] - min(dots)[1])