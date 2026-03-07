# [level0] 숨어있는 숫자의 덧셈 (2) - 120864

[문제 링크](https://www.acmicpc.net/problem/120864)

### 분류
- 배열
- 반복문

### 문제 요약
- 문자열 my_string 매개변수
- my_string은 소문자, 대문자, 자연수로만 구성되어있음
- my_string안의 자연수들의 합 리턴

### 풀이 아이디어
- "".join() 이용
- .isdigit() 이용해 숫자면 해당 숫자 붙이고 아니면 공백 ' ' 붙이기
- split() 이용해 숫자 판별