# [level1] 최소직사각형 - 86491

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/86491)

### 분류
- 이차원 배열

### 문제 요약
- 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes 매개변수
  - sizes의 길이는 1 이상 10,000 이하
  - sizes의 원소는 [w, h] 형식
  - w는 명함의 가로 길이를 나타냄
  - h는 명함의 세로 길이를 나타냄
  - w와 h는 1 이상 1,000 이하인 자연수
- 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기 리턴

### 풀이 아이디어
- 가장 큰 가로 길이를 나타내는 정수 변수 maxW를 0으로 초기화
- 가장 큰 세로 길이를 나타내는 정수 변수 maxH를 0으로 초기화
- 정수 배열 size가 sizes를 도는 for문 실행
  - 정수 변수 w를 Math.max(sizes[0], sizes[1])로 초기화
  - 정수 변수 h를 Math.min(sizes[0], size[1])로 초기화
  - maxW에 Math.max(w, maxW) 대입
  - maxH에 Math.max(h, maxH) 대입
- maxW * maxH 리턴