# [level1] 정수 내림차순으로 배치하기 - 12933

[문제 링크](https://www.acmicpc.net/problem/120933)

### 분류
- 정수

### 문제 요약
- 자연수 n 매개변수(10,000,000,000이하)
- n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수 리턴

### 풀이 아이디어
- 배열 char[] chars 에 String.valueOf(n).toCharArray() 대입
- Arrays.sort(chars) 정렬
- 0부터 chars.length / 2까지 도는 반복문 실행
- char temp = chars[i] 대입
- chars[i] = chars[chars.length - i - 1] 대입
- 다시 chars[chars.length - i - 1] = temp 대입
- Long.parseLong(new String(chars))으로 리턴