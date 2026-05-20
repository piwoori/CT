# [level1] 부족한 금액 계산하기 - 82612

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/82612)

### 분류
- 연산

### 문제 요약
- 놀이기구의 원래 이용료는 price, 놀이기구를 탈 횟수 count, 자신이 가지고 있는 금액 money 매개변수
  - 놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
  - 처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
  - 놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수
- 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받음
- 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지 리턴
- 금액이 부족하지 않으면 0 리턴

### 풀이 아이디어
- long 타입의 정수 변수 total을 (long) price * count * (count + 1) / 2로 초기화
  - 등차수열 합 공식 사용
- money >= total의 조건식을 만족하면 0 리턴
- total - money 리턴