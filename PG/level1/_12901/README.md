# [level1] 2016년 - 12901

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12901)

### 분류
- 배열

### 문제 요약
- 2016년 a월 b일을 나타내는 두 정수 a, b 매개변수
- 2016년은 윤년이자 2016년 1월 1일은 금요일
- 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
- 2016년 a월 b일이 무슨 요일인지 문자열로 리턴

### 풀이 아이디어
- 문자열 배열 day를 {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}로 초기화
- 각 달의 일수를 나타내는 정수 배열 month를 {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}로 초기화
- a월 b일까지의 총 일수를 나타내는 정수 변수 total을 0으로 초기화
- 정수 변수 i가 0부터 a - 1 전까지 도는 for문 실행
  - total에 month[i] 더하기
- total에 b - 1 더하기
  - 1월 1일 자체가 FRI, 즉 0일 지난 상태이기 때문
- day[total % 7] 리턴