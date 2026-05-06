# [level1] 하샤드 수 - 12947

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12947)

### 분류
- 정수
- 문자열

### 문제 요약
- 양의 정수 x 매개변수(1 이상, 10000 이하)
- 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 함
- x가 하샤드 수인지 아닌지  리턴

### 풀이 아이디어
- 문자열 s에 String.valueOf(x) 대입
- 정수 변수 sum 초기화
- i가 0부터 s.length()까지 도는 반복문 실행
- sum += s.charAt(i) - '0' 실행
- x % sum == 0 리턴