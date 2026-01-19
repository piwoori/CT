# [silver 4] 큐 2 - 18258

[문제 링크](https://www.acmicpc.net/problem/18258)

### 분류
- 큐
- 자료구조

### 문제 요약
- 명령의 개수 N (1 ≤ N ≤ 10,000) 입력
- 다음 N개의 줄에는 큐를 조작하는 명령이 하나씩 입력
- 명령은 push X, pop, size, empty, front, back으로 구성
- 큐가 비어 있을 경우 pop, front, back은 -1을 출력
- empty는 큐가 비어 있으면 1, 아니면 0을 출력

### 풀이 아이디어
- Queue<Integer>와 LinkedList를 사용하여 큐를 구현
- back 명령은 큐에서 직접 접근할 수 없으므로, 마지막으로 입력된 값을 따로 변수에 저장해 출력
- 출력이 여러 번 발생하므로 StringBuilder를 사용해 결과를 누적한 뒤 한 번에 출력하여 시간 초과를 방지
- 각 명령은 큐의 기본 메서드(add, poll, peek, size, isEmpty)를 이용해 처리