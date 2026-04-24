# [level0] 분수의 덧셈 - 120808

[문제 링크](https://www.acmicpc.net/problem/120808)

### 분류
- 연산
- 최대공약수

### 문제 요약
- 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2 매개변수
- 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배 리턴

### 풀이 아이디어
- math 라이브러리 import
- denom 변수에 denom1 * denom2 대입
- numer 변수에 numer1 * denom2 + numer2 * denom1 대입
- gcd 변수에 math.gcd(denom, numer) 대입
- [numer / gcd, denom / gcd] 리턴