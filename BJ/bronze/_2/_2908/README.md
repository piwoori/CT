# [bronze 2] 상수 - 2908

[문제 링크](https://www.acmicpc.net/problem/2908)

### 분류
- 반복문
- 조건문
- 문자열

### 문제 요약
- 상근이가 적은 같지 않은 세 자리 수 A와 B 입력
- 상수는 수를 거꾸로 읽음(예: 734 -> 437)
- 수의 크기를 비교하는 문제를 낼 때 상수의 대답을 출력

### 풀이 아이디어
- StringBuilder 이용
- .CharAt() 이용
- Integer.parseInt() 이용해 정수로 변환
- 배열끼리의 비교는 Arrays.equals(배열1, 배열2) 이용