# [level1] 소수 만들기 - 12977

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12977)

### 분류
- 소수

### 문제 요약
- 숫자들이 들어있는 배열 nums 매개변수
  - nums에 들어있는 숫자의 개수는 3개 이상 50개 이하
  - nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않음
- nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수 리턴

### 풀이 아이디어
- 정수 배열 nums을 매개변수로 하고 정수를 반환하는 solution 메소드 정의
  - 소수가 되는 경우의 수를 나타내는 정수 변수 answer을 0으로 초기화
  - 정수 변수 i가 0부터 nums.length - 2 전까지 도는 for문 실행
    - 정수 변수 j가 i + 1부터 nums.length - 1 전까지 도는 for문 실행
      - 정수 변수 k가 j + 1부터 nums.length 전까지 도는 for문 실행
        - 정수 변수 sum을 nums[i] + nums[j] + nums[k]로 초기화
        - isPrime(sum)의 조건식 만족 시 answer++ 실행
  - answer 리턴
- 정수 변수 num을 매개변수로 하고 불리언을 반환하는 isPrime 메소드 정의
  - num < 2의 조건식 만족 시 false 리턴
  - 정수 변수 i가 2부터 i * i가 num까지 도는 for문 실행
    - num % i == 0의 조건식 만족 시 false 리턴
  - true 리턴