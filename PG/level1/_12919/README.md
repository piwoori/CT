# [level1] 서울에서 김서방 찾기 - 12919

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12919)

### 분류
- 문자열
- 배열

### 문제 요약
- String형 배열 seoul 매개변수
  - seoul은 길이 1 이상, 1000 이하인 배열
  - seoul의 원소는 길이 1 이상, 20 이하인 문자열
  - "Kim"은 반드시 seoul 안에 포함
- 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String 리턴

### 풀이 아이디어
- 정수 변수 i가 0부터 seoul.length - 1까지 도는 반복문 실행
  - seoul[i].equals("Kim") 조건식 만족하면
    - "김서방은 " + i + "에 있다" 리턴
- "" 리턴