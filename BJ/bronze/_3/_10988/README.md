# [bronze 3] 팰린드롬인지 확인하기 - 10988

[문제 링크](https://www.acmicpc.net/problem/10988)

### 분류
- 문자열

### 문제 요약
- 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어진 단어 입력
- 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말함
- 팰린드롬이면 1, 아니면 0 출력

### 풀이 아이디어
- BufferedReader 이용
- StringBuilder(문자열).reverse().toString() 이용해 문자열 뒤집기
- .equals() 이용해 같은지 확인