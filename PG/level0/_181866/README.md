# [level 0] 문자열 잘라서 정렬하기 - 181866

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181866)

### 분류
- 문자열

### 문제 요약
- 문자열 myString 매개변수
- "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열 리턴
- 빈 문자열은 반환할 배열에 넣지 않음

### 풀이 아이디어
- split() 이용
- 새 리스트 바로 만들어서 쓰기: sorted() 이용
- 기존 리스트 정렬: sort() 이용