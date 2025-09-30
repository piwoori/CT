# [PCCE 기출문제] 7번 / 가습기

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/250127)

### 분류
- 조건문

### 문제 요약
- auto, target, minimum 세 가지 모드에 맞게 동작
- auto 모드: 0 <= 습도 < 10: 5단계, 10 <= 습도 < 20: 4단계, 20 <= 습도 < 30: 3단계, 30 <= 습도 < 40: 2단계, 40 <= 습도 < 50: 1단계, 50 <= 습도: 0단계
- target 모드: 습도 < 설정값: 3단계, 습도 <= 설정값: 1단계
- minimum 모드: 습도 <설정값: 1단계, 습도 <= 설정값: 0단계
- mode_type: 가습기 모드, humidity: 현재 습도, val_set: 설정값

### 풀이 아이디어
- if -elif 조건문 활용