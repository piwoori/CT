# [level0] 문자열 정렬하기 (1) - 120851

[문제 링크](https://www.acmicpc.net/problem/120850)

### 분류
- 반복문
- 문자열

### 문제 요약
- 문자열 my_string 매개변수
- my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트 리턴

### 풀이 아이디어
- isdigit() 이용해 정수인지 판별
- 추가할 때 int()로 형변환
- sorted()로 정렬