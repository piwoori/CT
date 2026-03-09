# [level0] 최댓값 만들기 (2) - 120862

[문제 링크](https://www.acmicpc.net/problem/120862)

### 분류
- 배열
- 반복문

### 문제 요약
- 정수 배열 numbers 매개변수
- numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값 리턴

### 풀이 아이디어
- sort() 이용해 오름차순 정렬
- max(numbers[0] * numbers[1], numbers[-1] * numbers[-2])으로 비교