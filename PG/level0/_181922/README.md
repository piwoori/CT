# [level 0] 수열과 구간 쿼리 4 - 181922

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181922)

### 분류
- 2차원 배열

### 문제 요약
- 정수 배열 arr와 2차원 정수 배열 queries 매개변수
- queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴
- query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1 더하기
- arr 리턴

### 풀이 아이디어
- 반복문 이용