# [level1] 햄버거 만들기 - 13502

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/133502)

### 분류
- 스택

### 문제 요약
- 상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient 매개변수
    - 1 ≤ ingredient의 길이 ≤ 1,000,000
    - ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미
- 상수는 햄버거를 포장하는 일을 함
- 상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장
- 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며, 재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없음
- 상수가 포장하는 햄버거의 개수 리턴

### 풀이 아이디어
- 포장하는 햄버거 개수를 나타내는 정수 변수 answer을 0으로 초기화
- Stack<Integer> stack을 Stack 구현체로 초기화
- 정수 변수 i가 ingredient를 도는 for문 실행
  - stack.push(i) 실행
  - stack.size() >= 4 조건식 만족 시
    - 정수 변수 size를 stack.size()로 초기화
    - stack.get(size - 4) == 1 && stack.get(size - 3) == 2 && stack.get(size - 2) == 3 && stack.get(size - 1) == 1 조건식 만족 시
      - stack.pop()을 네 번 실행
      - answer++ 실행
- answer 리턴