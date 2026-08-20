# [level1] 노란불 신호등 - 468371

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/468371)

### 분류
- 이차원 배열

### 문제 요약
- 신호등 n개의 신호 주기를 담은 2차원 정수 배열 signals 매개변수
    - 2 ≤ signals의 길이 = n ≤ 5
        - signals의 원소는 [G, Y, R] 형태의 길이가 3인 정수 배열
            - 순서대로 초록불, 노란불, 빨간불의 지속 시간을 의미
        - 1 ≤ G, Y, R ≤ 18
        - 3 ≤ G + Y + R ≤ 20
-  모든 신호등은 항상 초록불 → 노란불 → 빨간불 순서로 반복
- 각 신호의 지속 시간은 신호등마다 다름
- 시간은 1초부터 시작하며, 각 신호등은 처음에는 초록불 상태로 시작
- 모든 신호등이 모두 노란불이 되면 정전이 발생
- 모든 신호등이 노란불이 되는 가장 빠른 시각(초) 리턴
- 만약 모든 신호등이 노란불이 되는 경우가 존재하지 않는다면 -1 리턴

### 풀이 아이디어
- 정수를 반환하고 이자원 배열 signals를 매개변수로 하는 solution 메소드 정의
    - 신호등 주기의 최소 공배수를 나타내는 정수 변수 lcm을 1로 초기화
    - 정수 배열 signal이 signals를 도는 for문 실행
        - 신호등 주기를 나타내는 정수 변수 cycle을 signal[0] + signal[1] + signal[2]로 초기화
        - lcm에 ldm(ldm, cycle) 대입
    - 정수 변수 time이 1부터 lcm까지 도는 for문 실행
        - 모두 노란불인지를 나타내는 불리언 변수 allYellow를 true로 초기화
        - 정수 배열 signal이 signals를 도는 for문 실행
            - 정수 변수 green을 signal[0]로 초기화
            - 정수 변수 yellow를 signal[1]로 초기화
            - 정수 변수 cycle을 signal[0] + signal[1] + signal[2]로 초기화
            - 현재 시각을 나타내는 정수 변수 time을 (time - 1) % cycle로 초기화
                - time 변수는 1초부터 시자가지만 신호등 주기를 계산할 때는 0부터 시작하는 위치로 맞춰야 하기에 time -1로 설정
            - current < green || current >= green + yellow 조건식 만족 시
                - allYellow에 false 대입
                - break 살향
        - allYellow 조건식 만족 시
            - time 리턴
    - -1 라턴
- 정수를 반환하고 정수 변수 a, b를 매개변수로 하는 gcd 메소드 정의
    - b != 0 조건삭을 만족하는 while문 실행
        - 정수 변수 tmep를 a % b로 초기화
        - a에 b 대입
        - b에 temp 대입
    - a 리턴
- 정수를 반환하고 정수 변수 a, b를 매개변수로 하는 lcm 메소드 정의
    - a / gcd(a, b) * b 리턴