# [level2] 스킬트리 - 49993

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/49993)

### 분류
- ArrayList

### 문제 요약
- 선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees 매개변수
  - 스킬은 알파벳 대문자로 표기하며, 모든 문자열은 알파벳 대문자로만 이루어져 있음
  - 스킬 순서와 스킬트리는 문자열로 표기
    - 예를 들어, C → B → D 라면 "CBD"로 표기
  - 선행 스킬 순서 skill의 길이는 1 이상 26 이하이며, 스킬은 중복해 주어지지 않음
  - skill_trees는 길이 1 이상 20 이하인 배열
  - skill_trees의 원소는 스킬을 나타내는 문자열
    - skill_trees의 원소는 길이가 2 이상 26 이하인 문자열이며, 스킬이 중복해 주어지지 않음
- 선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻
- 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있음
- 가능한 스킬트리 개수 리턴

### 풀이 아이디어
- 배울 수 있는 스킬트리의 개수를 나타내는 정수 변수 answer을 0으로 초기화
- 문자열 tree가 배열 skill_trees을 도는 for문 실행
  - StringBuilder sb 초기화
  - 정수 변수 i가 0부터 tree.length() 전까지 도는 for문 실행
    - 문자 c를 tree.charAt(i)로 초기화
    - skill.indexOf(c) != -1의 조건식 만족 시
      - sb.append(c) 실행
  - skill.startsWith(sb.toString()) 조건식 만족 시
    - answer++ 실행
- answer 리턴