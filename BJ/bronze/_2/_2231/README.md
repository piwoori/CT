# [bronze 2] 분해합 - 2231

[문제 링크](https://www.acmicpc.net/problem/2231)

### 분류
- 조건문
- 반복문
- 연산

### 문제 요약
- 자연수 N(1 ≤ N ≤ 1,000,000) 입력
- 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미
- 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자
- N의 가장 작은 생성자 출력
- 생성자가 없는 경우에는 0 출력

### 풀이 아이디어
- 자리수 합의 최대값이 9 * 자리수 이므로 생성자는 N - 9×자리수 이상에서만 존재
- String.valueOf(N).length() 이용해 정수의 자릿수 구하기
- start = N - (9 * digit)로 설정
- start < 1 조건식 만족하면 start = 1
- i가 start부터 N까지 도는 반복문 실행
- sum과 num에 i 대입
- num > 0 만족하는 while문 실행
- sum = sum + (num % 10) 과 num /= 10 실행
- sum == N 만족하면 result = i 하고 break
- result 출력