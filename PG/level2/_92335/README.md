# [level2] k진수에서 소수 개수 구하기 - 92335

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/92335)

### 분류
- 진법
- 배열

### 문제 요약
- 정수 n과 k 매개변수
    - 1 ≤ n ≤ 1,000,000
    - 3 ≤ k ≤ 10
- n을 k진수로 바꿨을 때 다음 조건에 맞는 소수가 몇 개인지 알아보려 함
    - P0처럼 소수 양쪽에 0이 있는 경우
    - P0처럼 소수 오른쪽에만 0이 있고 왼쪽에는 아무것도 없는 경우
    - 0P처럼 소수 왼쪽에만 0이 있고 오른쪽에는 아무것도 없는 경우
    - P처럼 소수 양쪽에 아무것도 없는 경우
    - 단, P는 각 자릿수에 0을 포함하지 않는 소수
        - 예를 들어, 101은 P가 될 수 없음 
- n을 k진수로 바꿨을 때, 변환된 수 안에서 찾을 수 있는 위 조건에 맞는 소수의 개수 리턴

### 풀이 아이디어
- 정수를 반환하고 정수 n과 정수 k를 매개변수로 하는 solution 메소드 정의
    - 소수의 개수를 나타내는 정수 변수 answer를 0으로 초기화
    - k진수로 나타낸 문자열 converted를 Integer.toString(n, k)으로 초기화
    - 문자열 배열 nums를 converted.split("0")으로 초기화
    - 문자열 num이 nums를 도는 for문 실행
        - num.equals("") 조건식 만족 시
            - continue 실행해 반복문 탈출
        - long 타입 정수 변수 value를 Long.parseLong(num)로 초기화
        - isPrime(value) 조건식 만족 시
            - answer++ 실행
    - answer 리턴
- 불리언 변수를 반환하고 long 타입 정수 num을 매개변수로 하는 isPrime 메소드 정의
    - num < 2 조건식 만족 시
        - false 리턴
    - long 타입 정수 변수 i가 2부터 i * i가 num이 될 때까지 도는 for문 실행
        - num % i == 0 조건식 만족 시
            - false 리턴
    - true 리턴