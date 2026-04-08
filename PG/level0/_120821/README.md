# [level0] 배열 뒤집기 - 120821

[문제 링크](https://www.acmicpc.net/problem/120821)

### 분류
- 배열

### 문제 요약
- 정수가 들어 있는 배열 num_list 매개변수
- num_list의 원소의 순서를 거꾸로 뒤집은 배열 리턴

### 풀이 아이디어
- reverse()로 하면 반환되는 것은 null임
- reversed() 하고 list()로 감싸면 됨
- 아님 [::-1] 인덱스 슬라이싱 이용