# [level2] N개의 최소공배수 - 12953

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12953)

### 분류
- 최대 공약수
- 최소 공배수

### 문제 요약
- n개의 숫자를 담은 배열 arr 매개변수
  - arr은 길이 1이상, 15이하인 배열
  - arr의 원소는 100 이하인 자연수
- 이 수들의 최소공배수 리턴

### 풀이 아이디어
- 최대공약수를 구하는 정수 변수 a, b를 매개변수로 가지는 메소드 gcd 설정
  - b != 0의 조건식을 만족하는 while문 실행
    - 정수 변수 t에 b 대입
    - b에 a % b 대입
    - a에 t 대입
  - a 리턴
- 최소 공배수를 구하는 정수 변수 a, b를 매개변수로 가지는 메소드 lcm 설정
  - (a * b) / gcd(a, b) 리턴
- 주어진 solution 메소드 설정
  - 정수 변수 answer에 arr[0] 대입
  - i가 1부터 arr.length - 1까지 도는 반복문 실행
    - answer에 lcm(answer, arr[i]) 대입
  - answer 리턴