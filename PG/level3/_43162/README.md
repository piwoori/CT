# [level3] 정수 삼각형 - 43105

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/43105)

### 분류
- DFS

### 문제 요약
- 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers 매개변수
    - 컴퓨터의 개수 n은 1 이상 200 이하인 자연수
    - 각 컴퓨터는 0부터 n-1인 정수로 표현
    - i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]를 1로 표현
    - computer[i][i]는 항상 1
- 네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미
- 네트워크의 개수 리턴

### 풀이 아이디어
- int node, int[][] computers, boolean[] visited를 매개변수로 하는 dfs 메소드 정의
  - visited[node] = true 실행
  - 정수 변수 i가 0부터 computers.length - 1까지 도는 반복문 실헹
    - computers[node][i] == 1 && !visited[i]의 조건식을 만족하면 다시 dfs 재귀
- 메인 solution 메소드 실행
  - 정수 변수 answer = 0으로 초기화
  - boolean [] visited를 new boolean[n]로 초기화
  - 정수 변수 i가 0부터 n - 1까지 도는 반복문 실행
    - !visited[i]의 조건식을 만족하면 dfs(i, computers, visited) 실행 후 answer++
  - answer 리턴
    