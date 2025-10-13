# [level 0] 코드 처리하기 - 181932

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181932)

### 분류
- 조건문

### 문제 요약
- 문자열 code 매개변수
- mode가 1일 때: code[idx]가 "1"이 아니면 idx가 홀수일 때만 answer에 code[idx] 추가, code[idx]가 "1"이면 mode를 0으로 변경
- mode가 0일 때: code[idx]가 "1"이 아니면 idx가 짝수일 때만 answer에 code[idx] 추가, code[idx]가 "1"이면 mode를 1로 변경
- answer이 빈 문자열이면 "EMPTY" 리턴

### 풀이 아이디어
- if 조건문 이용