# [silver 4] 스택 - 10828

[문제 링크](https://www.acmicpc.net/problem/10828)

### 분류
- 스택
- 자료구조

### 문제 요약
- 명령의 개수 N (1 ≤ N ≤ 10,000) 입력
- 다음 N개의 줄에는 스택을 조작하는 명령이 하나씩 입력
- 명령은 push X, pop, size, empty, top으로 구성
- 스택이 비어 있을 경우 pop, top은 -1 출력
- empty는 비어 있으면 1, 아니면 0 출력

### 풀이 아이디어
- Stack<Integer> 사용하여 스택 구현
- 출력이 여러 번 발생하므로 StringBuilder 이용해 결과를 누적한 뒤 한 번에 출력하여 시간 초과를 방지
- 각 명령은 스택의 기본 메서드(push, pop, peek, size, isEmpty)를 이용해 처리