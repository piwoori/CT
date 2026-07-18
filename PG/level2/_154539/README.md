# [level2] 뒤에 있는 큰 수 찾기 - 154539

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/154539)

### 분류
- Stack
- Array

### 문제 요약
- 정수로 이루어진 배열 numbers 매개변수
  - 4 ≤ numbers의 길이 ≤ 1,000,000
    - 1 ≤ numbers[i] ≤ 1,000,000
- 뒷 큰 수: 배열 의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수
- 모든 원소에 대한 뒷 큰수들을 차례로 담은 배열 리턴
- 뒷 큰수가 존재하지 않는 원소는 -1을 담음

### 풀이 아이디어
- 정수 배열 answer을 numbers.length 크기로 초기화
- 큰 수를 찾지 못한 인덱스를 담을 Stack<Integer> stack 초기화
- Arrays.fill(answer, -1) 실행
- 정수 변수 i가 0부터 numbers.length 전까지 도는 for문 실행
  - !stack.isEmpty() && numbers[stack.peek()] < numbers[i] 조건식의 while문 실행
    - 해결 가능한 원소들까지 처리 하기 위해 if문 대신 while문 실행
    - answer[stack.pop()]에 numbers[i] 대입
  - stack.push(i) 실행
- answer 리턴