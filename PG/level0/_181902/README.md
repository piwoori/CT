# [level 0] 문자 개수 세기 - 181902

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181902)

### 분류
- 문자열
- 반복문
- 조건문

### 문제 요약
- 문자열 my_string 매개변수
- my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열 리턴

### 풀이 아이디어
- 배열을 [원소 * 52]로 선언
- 조건식을 '문자' <= 비교 대상 <= '문자' 으로 활용
- 문자를 아스키코드 값으로 변환하는 ord() 이용