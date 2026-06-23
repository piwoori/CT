# [level1] 둘만의 암호 - 155652

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/155652)

### 분류
- 문자열

### 문제 요약
- 두 문자열 s와 skip, 그리고 자연수 index 매개변수
  - 5 ≤ s의 길이 ≤ 50
  - 1 ≤ skip의 길이 ≤ 10
  - s와 skip은 알파벳 소문자로만 이루어져 있음
    - skip에 포함되는 알파벳은 s에 포함되지 않음
  - 1 ≤ index ≤ 20
- 다음 규칙에 따라 문자열 생성
  - 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줌
  - index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아감
  - skip에 있는 알파벳은 제외하고 건너뜀
- 위 규칙대로 s를 변환한 문자열 리턴

### 풀이 아이디어
- 빠른 문자열 생성 위해 StringBuilder sb 초기화
- 문자 c가 s.toCharArray()를 도는 for문 실행
  - 문자열은 객체가 아니기에 배열로 변환해야 함
  - 넘어가는 횟수를 나타내는 정수 변수 count를 0으로 초기화
  - count < index의 조건식을 만족하는 while문 실행
    - c++ 실행해 문자 밀기
    - c > 'z'의 조건식 만족 시 c에 'a'로 대입
    - skip.indexOf(c) == -1의 조건식 만족 시 count++ 실행해 넘어가는 횟수 증가시킴
  - sb.append(c) 실행
- sb.toString() 리턴