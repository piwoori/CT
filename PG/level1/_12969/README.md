# [level1] 직사각형 별찍기 - 12969

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12969)

### 분류
- 입출력

### 문제 요약
- 두 개의 정수 n과 m 입력
  - n과 m은 각각 1000 이하인 자연수
- 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태 출력

### 풀이 아이디어
- Scanner sc 초기화
- 정수 변수 a와 b를 각각 sc.nextInt()로 초기화
- 정수 변수 i가 0부터 b - 1까지 도는 for문 실행
  - 정수 변수 j가 0부터 a -1까지 도는 for문 실행
    - System.out.print('*') 실행
  - System.out.println() 실행