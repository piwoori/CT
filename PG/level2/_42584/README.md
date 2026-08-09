# [level2] 주식가격 - 42584

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42584)

### 분류
- 반복문

### 문제 요약
- 초 단위로 기록된 주식가격이 담긴 배열 prices 매개변수
  - prices의 각 가격은 1 이상 10,000 이하인 자연수
  - prices의 길이는 2 이상 100,000 이하
- 가격이 떨어지지 않은 기간은 몇 초인지를 담은 배열 리턴

### 풀이 아이디어
- prices.length 크기의 정수 배열 answer 초기화
- 정수 변수 i가 0부터 prices.length 전까지 도는 for문 실행
  - 정수 변수 j가 0부터 prices.length 전까지 도는 for문 실행
    - answer[i]++ 실행
    - prices[i] > prices[j] 조건식 만족 시 
      - break 실행
- answer 리턴