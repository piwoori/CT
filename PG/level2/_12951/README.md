# [level2] JadenCase 문자열 만들기 - 12951

[문제 링크](https://www.acmicpc.net/problem/12951)

### 분류
- 문자열
- 배열

### 문제 요약
- 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열 s 매개변수
- 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 씀
- s를 JadenCase로 바꾼 문자열 리턴

### 풀이 아이디어
- StringBuilder sb 초기화
- boolean done = false으로 설정
- 문자열 s를 문자 하나씩 도는 반복문 실행
- c == ' ' 이면 sb.append(c) 한 후 done = false 대입
- 아닐 시 다시 !done 이면 sb.append((Character.toUpperCase(c))) 한 후 done = true 대입
- 그 외는 sb.append((Character.toLowerCase(c)))
- 마지막에 sb.toString() 리턴