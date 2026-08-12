# [level1] 바탕화면 정리 - 161990

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/161990)

### 분류
- 2차원 배열

### 문제 요약
- 머쓱이의 컴퓨터 바탕화면의 상태를 나타내는 문자열 배열 wallpaper 매개변수
    - 1 ≤ wallpaper의 길이 ≤ 50
    - 1 ≤ wallpaper[i]의 길이 ≤ 50
        - wallpaper의 모든 원소의 길이는 동일
    - wallpaper[i][j]는 바탕화면에서 i + 1행 j + 1열에 해당하는 칸의 상태를 나타냄
    - wallpaper[i][j]는 "#" 또는 "."의 값만 가짐
    - 바탕화면에는 적어도 하나의 파일이 있음
    - 드래그 시작점 (lux, luy)와 끝점 (rdx, rdy)는 lux < rdx, luy < rdy를 만족
- 파일들은 바탕화면의 격자칸에 위치하고 바탕화면의 격자점들은 바탕화면의 가장 왼쪽 위를 (0, 0)으로 시작해 (세로 좌표, 가로 좌표)로 표현
- 빈칸은 ".", 파일이 있는 칸은 "#"의 값
- 드래그를 하면 파일들을 선택할 수 있고, 선택된 파일들을 삭제할 수 있음
- 머쓱이는 최소한의 이동거리를 갖는 한 번의 드래그로 모든 파일을 선택해서 한 번에 지우려고 하며 드래그로 파일들을 선택하는 방법은 다음과 같
    - 드래그는 바탕화면의 격자점 S(lux, luy)를 마우스 왼쪽 버튼으로 클릭한 상태로 격자점 E(rdx, rdy)로 이동한 뒤 마우스 왼쪽 버튼을 떼는 행
    - "점 S에서 점 E로 드래그한다"고 표현하고 점 S와 점 E를 각각 드래그의 시작점, 끝점이라고 표현
    - 점 S(lux, luy)에서 점 E(rdx, rdy)로 드래그를 할 때, "드래그 한 거리"는 |rdx - lux| + |rdy - luy|로 정의
    - 점 S에서 점 E로 드래그를 하면 바탕화면에서 두 격자점을 각각 왼쪽 위, 오른쪽 아래로 하는 직사각형 내부에 있는 모든 파일이 선택
- 바탕화면의 파일들을 한 번에 삭제하기 위해 최소한의 이동거리를 갖는 드래그의 시작점과 끝점을 담은 정수 배열 리턴
    - 드래그의 시작점이 (lux, luy), 끝점이 (rdx, rdy)라면 정수 배열 [lux, luy, rdx, rdy] 리턴
   
### 풀이 아이디어
- 최소 행 좌표의 값을 나타내는 정수 변수 minRow를 wallpaper.length로 초기화
- 최소 열 좌표의 값을 나타내는 정수 변수 minCol를 wallpaper[0].length()로 초기화
- 최대 행 좌표의 값을 나타내는 정수 변수 maxRow를 0으로 초기화
- 최대 열 좌표의 값을 나타내는 정수 변수 maxCol를 0으로 초기화
- 정수 변수 i가 wallpaper.length 전까지 도는 for문 실행
    - 정수 변수 j가 wallpaper[0].length() 전까지 도는 for문 실행
        - wallpaper[i].charAt(j) == '#' 조건식 만족 시
            - minRow에 Math.min(minRow, i) 대입
            - minCol에 Math.min(minCol, j) 대입
            - maxRow에 Math.max(maxRow, i + 1) 대입
            - maxCol에 Math.max(maxCol, j + 1) 대입
- new int[]{minRow, minCol, maxRow, maxCol} 리턴