# [level1] 폰켓몬 - 1845

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/1845)

### 분류
- Set

### 문제 요약
- N마리 폰켓몬의 종류 번호가 담긴 배열 nums 매개변수
  - nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수
  - 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수
- N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수 리턴
- 가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 리턴

### 풀이 아이디어
- Set<Integer> set을 HashSet으로 초기화
- 정수 변수 num이 nums를 도는 for문 실행
  - set.add(num) 실행해 중복 없이 저장
- 정수 변수 maxPick을 nums.length / 2로 초기화
- Math.min(maxPick, set.size()) 리턴