# [bronze 1] ROT13 - 11655

[문제 링크](https://www.acmicpc.net/problem/11655)

### 분류
- 조건문
- 리스트
- 형변환

### 문제 요약
- 길이가 100 넘지 않는 알파벳 대문자, 소문자, 공백, 숫자로만 이루어진 문자열 입력
- 영어 알파벳을 13글자씩 밀어서 만든 ROT13 암호화를 거친 문자열 출력

### 풀이 아이디어
- ArrayList 이용
- .add(), .get(), .set() 함수 이용
- Character.isUpperCase(), Character.isLowerCase() 이용
- 아스키코드의 각 대문자, 소문자 범위를 벗어나면 -26 해주기