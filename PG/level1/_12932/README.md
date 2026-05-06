# [level1] 자연수 뒤집어 배열로 만들기 - 12932

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120932)

### 분류
- 정수

### 문제 요약
- 자연수 n 매개변수(10,000,000,000이하)
- n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태 리턴

### 풀이 아이디어
- 문자열 변수 s 에 n 대입
- ArrayList<Integer> answer 초기화
- 반복문으로 answer.add(s.charAt(i) - '0')
- Collections.reverse() 이용해 뒤집기
- answer 리턴