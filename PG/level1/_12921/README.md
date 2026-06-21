# [level1] 소수 찾기 - 12921

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12921)

### 분류
- 소수

### 문제 요약
- 정수 n 매개변수
  - n은 2이상 1000000이하의 자연수
- 소수는 1과 자기 자신으로만 나누어지는 수를 의미(1은 소수가 아님)
- 1부터 입력받은 숫자 n 사이에 있는 소수의 개수 리턴

### 풀이 아이디어
- 소수의 개수를 나타내는 정수 변수 answer을 0으로 초기화
- 불리언 배열 prime을 n + 1 크기로 초기화
- 정수 변수 i가 2부터 n까지 도는 for문 실행
  - prime[i]에 true 대입
- 정수 변수 i가 2부터 i * i가 n까지 도는 for문 실행
  - prime[i]의 조건식 만족 시
    - 정수 변수 j가 i * i부터 n까지 i만큼 증가하며 도는 for문 실행
      - 소수가 아닌 prime[j]에 false 대입
- 정수 변수 i가 2부터 n까지 도는 for문 실행
  - prime[i] 조건식 만족 시
    - answer++ 실행
- answer 리턴