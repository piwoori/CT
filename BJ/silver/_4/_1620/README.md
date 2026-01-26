# [silver 4] 나는야 포켓몬 마스터 이다솜 - 1620

[문제 링크](https://www.acmicpc.net/problem/1620)

### 분류
- 해시

### 문제 요약
- 포켓몬의 개수 N, 문제(질문)의 개수 M 입력
- 이후 N개의 포켓몬 이름이 1번부터 N번까지 순서대로 입력
- 다음으로 M개의 질문이 주어짐
- 포켓몬 이름이 주어지면, 해당 포켓몬의 번호 출력
- 번호(숫자) 가 주어지면, 해당 번호의 포켓몬 이름 출력

### 풀이 아이디어
- 번호 → 이름일 때, String[] numToName 배열 이용
- 이름 → 번호일 때, HashMap<String, Integer> msp 이용
- 첫 글자가 숫자인지 Character.isDigit(q.charAt(0))로 판별
- 숫자라면 Integer.parseInt(q)로 다자리 번호도 처리
- 출력이 M번 발생하므로 StringBuilder에 답을 누적한 뒤 마지막에 한 번에 출력