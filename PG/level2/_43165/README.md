# [level2] 타겟 넘버 - 43165

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/43165)

### 분류
- DFS

### 문제 요약
- 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target 매개변수
  - 주어지는 숫자의 개수는 2개 이상 20개 이하
  - 각 숫자는 1 이상 50 이하인 자연수
  - 타겟 넘버는 1 이상 1000 이하인 자연수
- numbers의 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 함
- 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수 리턴

### 풀이 아이디어
- 방법의 수를 나타내는 정수의 전역 변수 answer를 0으로 초기화
- 정수를 반환하고 정수 배열 numbers와 정수 변수 target을 매개변수로 하는 solution 메소드 정의
  - dfs(numbers, target, 0, 0) 실행
    - 첫 시작은 idx, sum 둘 다 0으로 시작
  - answer 리턴
- 아무것도 반환하지 않고 정수 배열 numbers와 정수 변수 targe, 정수 변수 idx, 정수 변수 sum을 매개변수로 하는 dfs 메소드 정의
  - idx == numbers.length의 조건식 만족 시
    - sum == target의 조건식 만족 시
      - answer++ 실행
    - return 실행
  - + 의 경우로 가기 위해 dfs(numbers, target, idx + 1, sum + numbers[idx]) 실행
  - -의 경우로 가기 위해 dfs(numbers, target, idx + 1, sum - numbers[idx])