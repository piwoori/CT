# [level0] 캐릭터의 좌표 - 120861

[문제 링크](https://www.acmicpc.net/problem/120861)

### 분류
- 배열
- 반복문
- 조건문

### 문제 요약
- 머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board 매개변수
- 캐릭터는 항상 [0,0]에서 시작
- up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동
- 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y] 리턴

### 풀이 아이디어
- x와 y의 최대 범위를 각각 board[0] // 2, board[1] // 2로 설정
- key == "left" and x > - max_x 와 key == "down" and y > - max_y일 때는 1씩 감소
- key == "right" and x < max_x와 key == "up" and y < max_y일 때는 1씩 증가