# [level2] 피로도 - 87946

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/87946)

### 분류
- DFS

### 문제 요약
- 유저의 현재 피로도 k와 각 던전별 "최소 필요 피로도", "소모 피로도"가 담긴 2차원 배열 dungeons 매개변수
  - k는 1 이상 5,000 이하인 자연수
  - dungeons의 세로(행) 길이(즉, 던전의 개수)는 1 이상 8 이하
    - dungeons의 가로(열) 길이는 2
    - dungeons의 각 행은 각 던전의 ["최소 필요 피로도", "소모 피로도"]
    - "최소 필요 피로도"는 항상 "소모 피로도"보다 크거나 같음
    - "최소 필요 피로도"와 "소모 피로도"는 1 이상 1,000 이하인 자연수
    - 서로 다른 던전의 ["최소 필요 피로도", "소모 피로도"]가 서로 같을 수 있음
- "최소 필요 피로도"는 해당 던전을 탐험하기 위해 가지고 있어야 하는 최소한의 피로도를 의미
- "소모 피로도"는 던전을 탐험한 후 소모되는 피로도를 의미
- 일정 피로도를 사용해서 던전을 탐험할 수 있음
- 한 유저가 오늘 이 던전들을 최대한 많이 탐험
- 유저가 탐험할수 있는 최대 던전 수 리턴

### 풀이 아이디어
- 정수 변수 answer를 메소드 밖에서 0으로 초기화
- 불리언 배열 visited 선언
- 정수를 반환하고 정수 k와 정수 이차원 배열 dungeons를 매개변수로 하는 solution 메소드 정의
  - visited를 dungeons.length 크기로 초기화
  - dfs(k, dungeons, 0) 실행
  - answer 리턴
- 아무 것도 반환하지 않고 정수 변수 fatigue, 정수 이차원 배열 dungeon, 정수 count를 매개변수로 하는 dfs 메소드 정의
  - answer에 Math.max(answer, count) 대입해 현재까지 탐험한 최대 던전 개수 저장
  - 정수 변수 i가 0부터 dungeons.length - 1까지 도는 for문 실행
    - 이미 방문한 던전은 패스하는 visited[i] 조건식 만족 시 continue
    - 최소 피로도가 부족한 fatigue < dungeons[i][0] 조건식 만족 시 continue
    - visited[i]를 true로 설정
      - 위 두 조건식에 해당되지 않으면 방문한 것으로 처리 하기 위해
    - dfs(fatigue - dungeons[i][1], dungeons, count + 1) 실행
      - 기존 fatigue에서 소모 피로도를 뺌
      - 던전을 하나 더 탐험했으므로 count + 1
    - 재귀 끝나고 백트래킹 하기 위해 visited[i]를 false로 설정