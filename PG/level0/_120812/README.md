# [level0] 최빈값 구하기 - 120812

[문제 링크](https://www.acmicpc.net/problem/120812)

### 분류
- 배열

### 문제 요약
- 정수 배열 array 매개변수
- 최빈값 리턴
- 최빈값이 여러 개면 -1 리턴

### 풀이 아이디어
- [0]가 1001개인 배열 idx 설정
- array 배열의 원소를 인덱스로 가지고 도는 반복문에 해당하는 idx의 인덱스 값 +1
- idx.count(max(idx)) > 1 이면 -1 리턴
- 아니면 idx.index(max(idx)) 리턴