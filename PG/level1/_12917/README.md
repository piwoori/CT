# [level1] 문자열 내림차순으로 배치하기 - 12917

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12917)

### 분류
- 문자열
- 배열

### 문제 요약
- 문자열 s 매개변수 
  - 길이 1 이상
  - s는 영문 대소문자로만 구성
- s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열 리턴
  - 대문자는 소문자보다 작은 것으로 간주

### 풀이 아이디어
- 문자 변수을 원소로 하는 배열 arr를 s.toCharArray()로 초기화
  - toCharArray() 함수 내부에서 새로운 배열 객체를 만들어서 반환
- Arrays.sort(arr) 실행해 오름차순 정렬
- StringBuilder sb를 new StringBuilder(new String(arr))로 초기화
- sb.reverse().toString() 리턴
  - 문자 변수의 배열은 reverse()를 직접 적용하지 못함