# [level2] 전화번호 목록 - 42577

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42577)

### 분류
- 배열

### 문제 요약
- 전화번호부에 적힌 전화번호를 담은 배열 phone_book 매개변수
  - phone_book의 길이는 1 이상 1,000,000 이하
  - 각 전화번호의 길이는 1 이상 20 이하
  - 같은 전화번호가 중복해서 들어있지 않음
- 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를, 그렇지 않으면 true 리턴

### 풀이 아이디어
- 접두어 관계인 번호는 정렬 했을 때 붙어있기에 Arrays.sort(phone_book) 실행
- 정수 변수 i가 0부터 phone_book.length - 1까지 도는 for문 실행
  - phone_book[i + 1].startsWith(phone_book[i])를 만족 시 false 리턴
- true 리턴