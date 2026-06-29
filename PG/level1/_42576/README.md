# [level1] 완주하지 못한 선수 - 42576

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42576)

### 분류
- HashMap

### 문제 요약
- 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion 매개변수
  - 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하
  - completion의 길이는 participant의 길이보다 1 작음
  - 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있음
  - 참가자 중에는 동명이인이 있을 수 있음
- 완주하지 못한 선수의 이름 리턴

### 풀이 아이디어
- HashMap<String, Integer> map을 HashMap 구현체로 초기화
- 문자열 p 변수가 participant를 도는 for문 실행
  - map.put(p, map.getOrDefault(p, 0) + 1) 실행
- 문자열 c 변수가 completion를 도는 for문 실행
  - map.put(c, map.get(c) - 1) 실행
- 문자열 key 변수가 map.keySet()를 도는 for문 실행
  - map.get(key) > 0 조건식 만족 시 
    - key 리턴
- "" 리턴