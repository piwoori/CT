# [level1] 달리기 경주 - 178871

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/178871)

### 분류
- HashMap

### 문제 요약
- 선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings 매개변수
  - 5 ≤ players의 길이 ≤ 50,000
    - players[i]는 i번째 선수의 이름을 의미
    - players의 원소들은 알파벳 소문자로만 이루어져 있음
    - players에는 중복된 값이 들어가 있지 않음
    - 3 ≤ players[i]의 길이 ≤ 10
  - 2 ≤ callings의 길름 ≤ 1,000,000
    - callings는 players의 원소들로만 이루어져 있음
    - 경주 진행중 1등인 선수의 이름은 불리지 않음
- 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부름
- 경주가 끝났을 때 선수들의 이름을 1등부터 등수를 순서대로 담은 배열 리턴

### 풀이 아이디어
- 각 선수 이름과 등수를 나타내는 Map<String, Integer> map을 HashMap 구현체로 초기화
- 정수 변수 i가 0부터 players.length 전까지 도는 for문 실행
  - map.put(players[i], i) 실행해 각 선수 이름과 등수를 저장
- 문자열 변수 calling이 callings 배열을 도는 for문 실행
  - 해설진이 이름이 부른 선수의 등수를 나타내는 정수 변수 index를 map.get(calling) 초기화
  - 해설진이 부른 선수를 앞선 선수의 이름을 나타내는 문자열 변수 frontPlayer을 players[index - 1]로 초기화
  - players[index - 1]에 calling 대입
  - players[index]에 frontPlayer 대입
  - map.put(calling, index - 1) 실행해 새로운 등수 저장
  - map.put(frontPlayer, index) 실행해 새로운 등수 저장
- players 리턴