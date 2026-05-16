# [level2] 할인 행사 - 131127

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131127)

### 분류
- HashMap

### 문제 요약
- 정현이가 원하는 제품을 나타내는 문자열 배열 want 매개변수
  - 1 ≤ want의 길이 ≤ 1
  - want의 원소들은 알파벳 소문자로 이루어진 문자열
  - 1 ≤ want의 원소의 길이 ≤ 12
- 정현이가 원하는 제품의 수량을 나타내는 정수 배열 number 매개변수
  - 1 ≤ want의 길이 = number의 길이 ≤ 1
  - 1 ≤ number의 원소 ≤ 10
  - number[i]는 want[i]의 수량을 의미
  - number의 원소의 합은 10
- XYZ 마트에서 할인하는 제품을 나타내는 문자열 배열 discount 매개변수
  - 10 ≤ discount의 길이 ≤ 100,000
  - discount의 원소들은 알파벳 소문자로 이루어진 문자열
  - 1 ≤ discount의 원소의 길이 ≤ 12
- XYZ 마트는 일정한 금액을 지불하면 10일 동안 회원 자격을 부여
- XYZ 마트에서는 회원을 대상으로 매일 한 가지 제품을 할인하는 행사 진행
- 할인하는 제품은 하루에 하나씩만 구매 가능
-  정현이는 자신이 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 맞춰서 회원가입을 하려 함
- 원등록시 정현이가 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수 리턴
- 가능한 날이 없으면 0 리턴

### 풀이 아이디어
- 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 나타내는 정수 변수 answer을 0으로 초기화
- 정수 변수 i가 0부터 discount.length - 10까지 도는 for문 실행
  - Map<String, Integer> map을 HashMap 구현체로 초기화
  - 정수 변수 j가 i부터 i + 10 - 1까지 도는 for문 실행
    - map.put(discount[j], map.getOrDefault(discount[j], 0) + 1) 실행
    - 해당 물품의 값이 없으면 0 + 1
    - 해당 물품의 값이 존재하면 기존 값 + 1
  - 정현이가 원하는 상황인지 아닌지를 나타내는 불리언 변수 check를 true로 초기화
  - 정수 변수 j가 0부터 want.length - 1까지 도는 for문 실행
    - map.getOrDefault(want[j], 0) != number[j]의 조건식을 만족하면
      - check에 false 대입
      - break문 실행
  - check 조건식 만족시 answer++ 실행
- answer 리턴