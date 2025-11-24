# [silver 5] 소트인사이드 - 1427

[문제 링크](https://www.acmicpc.net/problem/1427)

### 분류
- 조건문
- 반복문
- 배열
- 내림차순 정렬

### 문제 요약
- 1,000,000,000 이하의 정렬하려고 하는 수 N 입력
- 내림차순으로 정렬한 수를 출력

### 풀이 아이디어
- 배열 선언 시 int가 아닌 Integer로 초기화
- .charAt(i) - '0' 혹은 Integer.parseInt(String.valueOf(.charAt(i))) 이요해
  인수로 저장
- Arrays.sort(list, Comparator.reverseOrder()) 이용해 내림차순 정렬