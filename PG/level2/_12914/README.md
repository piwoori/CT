# [level2] 숫자의 표현 - 12924

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12924)

### 분류
- 문자열
- 약수

### 문제 요약
- 멀리뛰기에 사용될 칸의 수 n 매개변수
  - n은 1 이상, 2000 이하인 정수
- 끝에 도달하는 방법이 몇 가지인지 알아내, 여기에 1234567를 나눈 나머지 리턴

### 풀이 아이디어
- 선택지 2개 + 이전 상태 의존 → dp[n] = dp[n-1] + dp[n-2]
- long 타입 변수 prev을 1로, long 타입 변수 curr을 2로 초기화
- n == 1의 조건식 만족하면 1 반환
- n == 2의 조건식 만족하면 2 반환
- i가 3부터 n까지 도는 반복문 실행
  - long 타입 변수를 (prev + curr) % 1234567로 초기화
  - prev에 next 대입
  - curr에 next 대입
- curr 반환