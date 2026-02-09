# [level0] 인덱스 바꾸기 - 120895

[문제 링크](https://www.acmicpc.net/problem/120895)

### 분류
- 문자열

### 문제 요약
- 문자열 my_string과 정수 num1, num2 매개변수
- my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열 리턴

### 풀이 아이디어
- 문자열을 리스트로 변환(문자열은 불변이기에)
- swap 이용해 해당 문자 교환
- "".join() 이용