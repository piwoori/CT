# [bronze 3] 모음의 개수 - 10987

[문제 링크](https://www.acmicpc.net/problem/10987)

### 분류
- ArrayList

### 문제 요약
- 소문자로 이루어진 단어 입력
- 모음의 개수 출력

### 풀이 아이디어
- ArrayList 이용
- 반복문으로 .add(String.valueOf(input.charAt(i))) 이용해 문자 하나식 저장
- .get 함수는 문자열 주소 반환
- 따로 문자 변수 만들어서 저장 후, .equals() 함수로 문자 비교