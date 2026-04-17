# [bronze 2] 커트라인 - 25305

[문제 링크](https://www.acmicpc.net/problem/25305)

### 분류
- 배열

### 문제 요약
- 응시자의 수 N(1 <= N <= 1000)과 상을 받는 사람의 수 k(1 <= k <= N)가 공백을 사이에 두고 입력(-999 이상 999 이하)
- 각 학생의 점수 x(0 <= x <= 10000)가 공백을 사이에 두고 입력
- 커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말할 때
- 상을 받는 커트라인 점수 출력

### 풀이 아이디어
- BufferedReader와 StringTokenizer로 N과 k 입력 받기
- 객체인 Integer 타입의 배열 list 초기화
- 0부터 N까지 도는 반복문으로 하나씩 저장
- Arrays.sort(list, Collections.reverseOrder()) 이용해 역순 정렬
- list[k - 1] 출력