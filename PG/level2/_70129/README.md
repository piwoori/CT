# [level2] 이진 변환 반복하기 - 70129

[문제 링크](https://www.acmicpc.net/problem/70129)

### 분류
- 이진법

### 문제 요약
- 0과 1로 이루어진 문자열 s 입력
- 이진 변화는 다음과 같은
  - x의 모든 0을 제거
  - x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿈
- s가 "1"이 될 때까지 계속해서 s에 이진 변환을 했을 때
- 진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 리턴

### 풀이 아이디어
- BufferedReader 이용해 s 입력 받음
- 정수 변수 cnt, zerocnt 초기화 (각각 이진 변환의 횟수, 변환 과정에서 제거된 모든 0의 개수를 의미)
- !s.equals("1") 조건식의 while문 실행
- 정수 변수 onecnt 초기화(1의 개수)
- 0부터 s.length()까지 도는 반복문 실행
- s.charAt(i) == '1'이면 onecnt++, 아니면 zerocnt++
- s에 Integer.toBinaryString(onecnt) 대입
- cnt++ 실행
- 반복문 끝낸 뒤 new int[]{cnt, zerocnt} 리턴