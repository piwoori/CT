# [level1] 이상한 문자 만들기 - 12930

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120930)

### 분류
- 문자열

### 문제 요약
- 한 개 이상의 단어로 구성되어 있는 문자열 s 매개변수
  - 각 단어는 하나 이상의 공백문자로 구분되어 있음
- 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단
- 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리
- 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열 리턴

### 풀이 아이디어
- 각 단어의 인덱스 번호를 나타내는 정수 변수 idx를 0으로 초기화
- 빠른 입출력 위해 StringBuilder sb 초기화
- 정수 변수 i가 0부터 s.length - 1까지 도는 for문 실행
  - 문자 c를 s.charAt(i)로 초기화
  - c == ' '의 조건식을 만족 시 
    - sb.append(' ') 실행 후 idx를 0으로 초기화
  - 그 외일 시
    - idx % 2 == 0의 조건식 만족 시
      - sb.append(Character.toUpperCase(c)) 실행 해 대문자로 변환
    - 그 외일 시
      - sb.append(Character.toLowerCase(c)) 실행 해 소문자로 변환
  - idx++ 실헹
- sb.toString() 리턴