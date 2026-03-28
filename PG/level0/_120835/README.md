# [level0] 진료 순서 정하기 - 120835

[문제 링크](https://www.acmicpc.net/problem/120835)

### 분류
- 반복문

### 문제 요약
- 정수 배열 emergency 매개변수
- 응급도가 높은 순서대로 진료 순서를 정한 배열 리턴

### 풀이 아이디어
- 역수 정렬 sorted(배열 이름, reverse = True) 이용
- 해당 _배열_이름.index() + 1 이용해 순서 찾기