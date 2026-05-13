# [level1] 핸드폰 번호 가리기 - 12948

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12948)

### 분류
- 문자열

### 문제 요약
- 전화번호가 문자열 phone_number 매개변수
  - phone_number는 길이 4 이상, 20이하
- 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열 리턴

### 풀이 아이디어
- 문자열 변수 answer을 ""으로 초기화
- 정수 변수 i가 0부터 phone_number.length() -1 까지 도는 반복문 실행
  - i < phone_number.length() - 4의 조건식을 만족하면 answer += '*'
  - 아니면 answer += phone_number.charAt(i)
- answer 리턴