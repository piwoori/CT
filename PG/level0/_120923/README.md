# [level0] 연속된 수의 합 - 120923

[문제 링크](https://www.acmicpc.net/problem/120923)

### 분류
- 반복문

### 문제 요약
- 두 정수 num과 total 매개변수
- 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 리턴

### 풀이 아이디어
- 평균 값, 시작점, 끝점 구하기
- 시작점은 average - (num - 1) // 2로
- 끝점은 average + (num + 2) //2로 구함