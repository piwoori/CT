# [level1] 유연근무제 - 388351

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/388351)

### 분류
- 1차원 배열
- 2차원 배열

### 문제 요약
- 직원 n명이 설정한 출근 희망 시각을 담은 1차원 정수 배열 schedules, 직원들이 일주일 동안 출근한 시각을 담은 2차원 정수 배열 timelogs, 이벤트를 시작한 요일을 의미하는 정수 startday 매개변수
    - 1 ≤ schedules의 길이 = n ≤ 1,000
        - schedules[i]는 i + 1번째 직원이 설정한 출근 희망 시각을 의미
        - 700 ≤ schedules[i] ≤ 1100
    - 1 ≤ timelogs의 길이 = n ≤ 1,000
        - timelogs[i]의 길이 = 7
        - timelogs[i][j]는 i + 1번째 직원이 이벤트 j + 1일차에 출근한 시각을 의미
        - 600 ≤ timelogs[i][j] ≤ 2359
    - 1 ≤ startday ≤ 7
        - 1은 월요일, 2는 화요일, 3은 수요일, 4는 목요일, 5는 금요일, 6은 토요일, 7은 일요일에 이벤트를 시작했음을 의미
    - 출근 희망 시각과 실제로 출근한 시각을 100으로 나눈 나머지는 59 이하
- 오늘부터 일주일 동안 각자 설정한 출근 희망 시각에 늦지 않고 출근한 직원들에게 상품을 주는 이벤트를 진행
- 직원들은 일주일동안 자신이 설정한 출근 희망 시각 + 10분까지 어플로 출근
- 토요일, 일요일의 출근 시각은 이벤트에 영향을 끼치지 않음
- 직원들은 매일 한 번씩만 어플로 출근하고, 모든 시각은 시에 100을 곱하고 분을 더한 정수로 표현
- 상품을 받을 직원의 수 리턴

### 풀이 아이디어
- 정수를 반환하고 정수 배열 schedules, 2차원 정수 배열 timelogs, 정수 startday를 매개변수로 하는 solution 메소드 정의
    - 상품을 받을 수 있는 직원의 수를 나타내는 정수 변수 answer을 0으로 초기화
    - 정수 변수 i가 0부터 schedules.length 전까지 도는 for문 실행
        - 제한 시간을 나타내는 정수 변수 limit을 toMinute(schedules[i]) + 10으로 초기화
        - 성공 여부를 나타내는 불리언 변수 success를 true로 초기화
        - 정수 변수 j가 0부터 7 전까지 도는 for문 실행
            - 현재 요일을 나타내는 정수 변수 day를 (startday + j - 1) % 7 + 1로 초기화
                - day == 6 || day == 7 조건식 만족 시 continue 실행
            - 각 요일 별 도착한 시간을 나타내는 정수 변수 arrive를 toMinute(timelogs[i][j])로 초기화
            - arrive > limit 조건식 만족 시
                - success에 false 대입
                - break 실행
        - success 조건식 만족 시
            - answer++ 실행
    - answer 리턴
- 정수를 반환하고 정수 time을 매개변수로 하는 toMinute 메소드 정의
    - 정수 변수 hour를 time / 100으로 초기화
    - 정수 변수 minute를 time % 100으로 초기화
    - hour * 60 + minute 리턴 해 분으로 표현
