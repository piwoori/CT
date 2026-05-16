# [level1] 가운데 글자 가져오기 - 12903

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12903)

### 분류
- 문자열

### 문제 요약
- 문자열 s 매개변수
  - s는 길이가 1 이상, 100이하
- 가운데 글자 리턴
- 단어의 길이가 짝수라면 가운데 두글자 리턴

### 풀이 아이디어
- 정수 변수 numdmf s.length() / 2으로 초기화
- s.length() % 2 == 0의 조건식 만족하면
  - s.substring(num - 1, num + 1) 리턴
- 아닐 시
  - s.substring(num, num + 1) 리턴