# [level 0] 부분 문자열 이어 문자열 만들기 - 181911

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181911)

### 분류
- 반복문
- 문자열 슬라이싱

### 문제 요약
- 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수
- parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미
- my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열 리턴

### 풀이 아이디어
- 문자열 슬라이싱
- zip() 함수 이용해 리스트 동시에 병렬 순회