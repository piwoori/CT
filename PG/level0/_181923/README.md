# [level 0] 수열과 구간 쿼리 2 - 181923

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181923)

### 분류
- 2차원 배열

### 문제 요약
- 정수 배열 arr와 2차원 정수 배열 queries 매개변수
- queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴
- query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i] 저장
- 특정 쿼리의 답이 존재하지 않으면 -1을 저장
- 결과 리스트 리턴

### 풀이 아이디어
- 임시 리스트 [] 이용
- .append 함수 이용