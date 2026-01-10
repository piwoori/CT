# [silver 4] 덱 - 10866

[문제 링크](https://www.acmicpc.net/problem/10866)

### 분류
- 덱
- 자료구조

### 문제 요약
- 명령의 개수 N (1 ≤ N ≤ 10,000) 입력
- 다음 N개의 줄에는 덱을 조작하는 명령이 하나씩 입력
- 명령은 push_front X, push_back X, pop_front, pop_back, size, empty, front, back으로 구성
- 큐가 비어 있을 경우 pop, front, back은 -1을 출력
- empty는 큐가 비어 있으면 1, 아니면 0을 출력

### 풀이 아이디어
- Deque<Integer>와 ArrayDeque를 사용하여 덱을 구현
- offerFirst, offerLast를 이용해 앞·뒤 삽입을 처리
- pollFirst, pollLast, peekFirst, peekLast를 이용해 앞·뒤 삭제 및 조회를 수행
- 덱이 비어 있는 경우를 isEmpty()로 판단하여 예외 상황을 처리
- 출력이 여러 번 발생하므로 StringBuilder에 결과를 누적한 뒤 한 번에 출력하여 시간 초과를 방지