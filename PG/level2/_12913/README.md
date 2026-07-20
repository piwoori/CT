# [level2] 땅따먹기 - 12913

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12913)

### 분류
- 배열

### 문제 요약
- 총 N행 4열로 이루어진 땅따먹기 점수판인 2차원 배열 매개변수
  - 행의 개수 N : 100,000 이하의 자연수
  - 열의 개수는 4개
  - 점수 : 100 이하의 자연수
- 1행부터 땅을 밟으며 한 행씩 내려올 때, 각 행의 4칸 중 한 칸만 밟으면서 내려와야 함
- 땅따먹기 게임에는 한 행씩 내려올 때, 같은 열을 연속해서 밟을 수 없음
- 얻을 수 있는 점수의 최대값 리턴

### 풀이 아이디어
- 정수 변수 i가 1부터 land.length 전까지 도는 for문 실행
  - land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i -1][3])) 실헹
  - land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i -1][3])) 실행
  - and[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i -1][3])) 실행
  - land[i][3] += Math.max(land[i -1][0], Math.max(land[i - 1][1], land[i - 1][2])) 실행
  - 한 번 거친 행은 다시 쓸일이 없으므로 누적해 계산
- 정수 변수 last를 land.length - 1로 초기화
- Math.max(land[last][0], Math.max(land[last][1], Math.max(land[last][2], land[last][3]) ) ) 리턴