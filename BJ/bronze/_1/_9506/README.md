# [bronze 1] 약수들의 합 - 9506

[문제 링크](https://www.acmicpc.net/problem/9506)

### 분류
- 약수

### 문제 요약
- 테스트 케이스마다 한 줄 간격으로 n 입력(2 < n < 100,000)
- 입력 마지막은 -1
- n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력(예:- 6 = 1 + 2 + 3)
- 약수들은 오름차순으로 나열
- n이 완전수가 아니라면 n is NOT perfect. 를 출력

### 풀이 아이디어
- while(true) 반복문 실행
- ArrayList 이용
- BufferedReader와 StringBuilder로 빠른 입출력