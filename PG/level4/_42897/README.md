# [level4] 도둑질 - 42897

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42897)

### 분류
- 배열
- 메소드

### 문제 요약
- 각 집에 있는 돈이 담긴 배열 money 매개변수
    - 이 마을에 있는 집은 3개 이상 1,000,000개 이하
    - money 배열의 각 원소는 0 이상 1,000 이하인 정수
- 이 마을의 모든 집들은 동그랗게 배치 되어있음
- 각 집들은 서로 인접한 집들과 방범장치가 연결되어 있기 때문에 인접한 두 집을 털면 경보가 울림
- 도둑이 훔칠 수 있는 돈의 최댓값 리턴

### 풀이 아이디어
- 정수를 반환하고 int[] money를 매개변수로 갖는 solution 메소드 정의
    - 정수 변수 n을 money.length로 초기화
    - 첫 번째 집을 털면 마지막 집은 털면 안 되기에 n - 2까지 돌기
    - 첫 번째 집을 안 털면 마지막 집은 털어도 되기에 n - 1까지 돌기
    - Math.max(rob(money, 0, n - 2), rob(money, 1, n - 1)) 리턴
- 정수를 반환하고 int[] money, int start, int end를 매개변수로 갖는 rob 메소드 정의
    - 전전 집을 나타내는 정수 변수 prev2를 0으로 초기화
    - 전 집을 나타내는 정수 변수 prev1을 0으로 초기화
    - 정수 변수 i가 start부터 end까지 도는 반복문 실행
        - 정수 변수 cur를 Math.max(prev1, (prev2 + money[i]))로 초기화
        - prev2에 prev1 대입
        - prev1에 cur 대입
    - prev1 리턴