# [level2] 괄호 회전하기 - 76502

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/76502)

### 분류
- 스택

### 문제 요약
- 대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s 매개변수
  - s의 길이는 1 이상 1,000 이하
- 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의
  - (), [], {} 는 모두 올바른 괄호 문자열
  - 만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열
  - 만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열
- s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수 리턴

### 풀이 아이디어
- 정수를 반환하고 문자열 s를 매개변수로 하는 solution 메소드 정의
  - x의 개수를 나타내는 정수 변수 answer을 0으로 초기화
  - 정수 변수 i가 0부터 s.length() - 1까지 도는 for문 실행
    - 문자열 rotated를 s.substring(i) + s.substring(0, i)로 초기화
    - isValid(rotated)의 조건식을 만족하면 answer++ 실행
  - answer 리턴
- 불리언을 반환하고 문자열 str을 매개변수로 하는 isValid 메소드 정의
  - Stack<Character> stack을 초기화
  - 정수 변수 i가 0부터 str.length() - 1까지 도는 for문 실행
    - 문자 변수 c를 str.CharAt(i)로 초기화
    - c == '(' || c == '{' || c == '['의 조건식 만족하면
      - stack.push(c) 실행
    - 아닐 시
      - stack.isEmpty()의 조건식 만족하면 false 리턴
      - 문자 변수 top을 stack.pop()으로 초기화
      - c == ')' && top != '('의 조건식 만족하면 false 리턴
      - c == '}' && top != '{'의 조건식 만족하면 false 리턴
      - c == ']' && top != '['의 조건식 만족하면 false 리턴
  - stack.isEmpty() 리턴