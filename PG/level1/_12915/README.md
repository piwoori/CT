# [level1] 문자열 내 마음대로 정렬하기 - 12915

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12915)

### 분류
- 배열
- 람다식

### 문제 요약
- 문자열로 구성된 리스트 strings와, 정수 n 매개변수
  - strings는 길이 1 이상, 50이하인 배열
  - strings의 원소는 소문자 알파벳으로 이루어져 있음
  - strings의 원소는 길이 1 이상, 100이하인 문자열
  - 모든 strings의 원소의 길이는 n보다 큼
  - 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치
- 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬한 배열 리턴

### 풀이 아이디어
- Arrays.sort() 실행
  - Strings 배열을 (a, b)의 람다식으로 판단
    - a.charAt(n) == b.charAt(n) 조건식 만족 시
      - a.compareTo(b) 리턴
    - a.charAt(n) - b.charAt(n) 리턴
      - 음수일 때는 a, 양수일 때는 b
- strings 리턴