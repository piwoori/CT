# [bronze 3] 열 개씩 끊어 출력하기 - 11721

[문제 링크](https://www.acmicpc.net/problem/11721)

### 분류
- 문자열 출력

### 문제 요약
- 단어 N 입력
- 한 줄에 10글자씩 끊어서 출력

### 풀이 아이디어
- String은 내부적으로 char[] 배열로 되어있어 바로 .charAT()으로 저장 불필요
- Math.min으로 end 점 비교