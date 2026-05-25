# [level1] 크기가 작은 부분 문자열 - 147355

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/147355)

### 분류
- 문자열

### 문제 요약
- 숫자로 이루어진 문자열 t와 p 매개변수
  - 1 ≤ p의 길이 ≤ 18
  - p의 길이 ≤ t의 길이 ≤ 10,000
  - t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않음
- t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수 리턴

### 풀이 아이디어
- 개수를 나타내는 정수 변수 answer를 0으로 초기화
- long 타입 정수 변수 num을 Long.parseLong(p)으로 초기화
- 정수 변수 i가 0부터 t.length() - p.length()까지 도는 for문 실행
  - long 타입 정수 변수 num_t을 Long.parseLong(t.substring(i, i + p.length()))로 초기화
    - substring() 이용해 부분 문자열 추출
  - num_t <= num의 조건식 만족시 answer++ 실행
- answer 리턴