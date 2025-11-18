# [level 0] 리스트 자르기 - 181897

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181897)

### 분류
- 리스트 슬라이싱

### 문제 요약
- 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list 매개변수
- slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하여 리턴
- n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
- n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
- n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
- n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로

### 풀이 아이디어
- 인덱스 슬라이싱 이용
- "변수, 변수, 변수 = 리스트" 방식 이용