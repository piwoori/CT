# [silver 5] 좌표 정렬하기 2 - 11651

[문제 링크](https://www.acmicpc.net/problem/11651)

### 분류
- 반복문
- 조건문
- 람다식

### 문제 요약
- 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000) 입력
- 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi 입력(-100,000 ≤ xi, yi ≤ 100,000)
- 좌표는 항상 정수이고, 위치가 같은 두 점은 없음
- 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬
- 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력

### 풀이 아이디어
- BufferedReader로 N 입력 받기
- [N][2] 크기의 정수 이차원 배열 초기화
- StringTokenizer과 반복문으로 배열에 원소 저장
- Arrays.sort(list, (a, b) ->의 람다식 실행
- a[1] == b[1]이면 a[0] - b[0] 리턴
- 그 외는 a[1] - b[1] 리턴
- StringBuilder sb 이용해 빠른 출력
- 반복문으로 sb.append(list[i][0]).append(" ").append(list[i][1]).append("\n") 실행
- 최종적으로 sb 출력