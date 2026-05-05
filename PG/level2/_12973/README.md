# [level2] 짝지어 제거하기 - 12973

[문제 링크](https://www.acmicpc.net/problem/12973)

### 분류
- 스택

### 문제 요약
- 길이가 1,000,000이하이고 소문자로 이루어진 문자열 S 매개변수
- 짝지어 제거 실행
  - 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾음
  - 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙임
  - 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료
- 성공적으로 수행할 수 있으면 1을, 아닐 경우 0 리턴
- 
### 풀이 아이디어
- Stack<Character> stack 초기화
- char c : s.toCharArray() 조건식의 for 반복문 실행
  - !stack.isEmpty() && stack.peek() == c 조건식을 만족하면 
    - stack.pop()
  - 만족하지 못하면
    - stack.push(c)
-  stack.isEmpty() ? 1 : 0 리턴