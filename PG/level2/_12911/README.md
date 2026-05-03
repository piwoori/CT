# [level2] 다음 큰 숫자 - 12911

[문제 링크](https://www.acmicpc.net/problem/12911)

### 분류
- 조건문
- 반복문
- 이진법

### 문제 요약
- 자연수 n 매개변수
- n의 다음 큰 숫자는 다음과 같이 정의
  - 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수
  - 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같음
  - 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수
- n의 다음 큰 숫자 리턴

### 풀이 아이디어
- 정수 onecnt 변수를 Integer.bitCount(n) 초기화
- while문 실행 후 n++
- Integer.bitCount(n) == onecnt면 n 리턴