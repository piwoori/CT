# [level1] 카드 뭉치- 159994

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/159994)

### 분류
- 배열

### 문제 요약
- 문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal 매개변수
  - 1 ≤ cards1의 길이, cards2의 길이 ≤ 10
  - 1 ≤ cards1[i]의 길이, cards2[i]의 길이 ≤ 10
  - cards1과 cards2에는 서로 다른 단어만 존재
  - 2 ≤ goal의 길이 ≤ cards1의 길이 + cards2의 길이
  - 1 ≤ goal[i]의 길이 ≤ 10
  - cards1, cards2, goal의 문자열들은 모두 알파벳 소문자로만 이루어져 있음
- 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 확인
  - 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용
  - 한 번 사용한 카드는 다시 사용할 수 없음
  - 카드를 사용하지 않고 다음 카드로 넘어갈 수 없음
  - 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없음
- cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No" 리턴

### 풀이 아이디어
- cards1의 진행 순서를 나타내는 정수 변수 idx1을 0으로 초기화
- cards2의 진행 순서를 나타내는 정수 변수 idx2을 0으로 초기화
- 문자열 word가 goal을 도느 for문 실행
  - idx1 < cards1.length && word.equals(cards1[idx1])의 조건식 만족 시 idx1++ 실행
  - idx2 < cards2.length && word.equals(cards2[idx2])의 조건식 만족 시 idx2++ 실행
  - 그 외는 "No" 리턴
- "Yes" 리턴