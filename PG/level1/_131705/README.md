# [level1] 삼총사- 131705

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131705)

### 분류
- 배열

### 문제 요약
- 한국중학교 학생들의 번호를 나타내는 정수 배열 number 매개변수
  - 3 ≤ number의 길이 ≤ 13
  - -1,000 ≤ number의 각 원소 ≤ 1,000
  - 서로 다른 학생의 정수 번호가 같을 수 있음
- 이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사
- 학생들 중 삼총사를 만들 수 있는 방법의 수 리턴

### 풀이 아이디어
- 방법의 수를 나타내는 정수 변수 answer를 0으로 초기화
- 정수 변수 i가 0부터 number.length - 1까지 도는 반복문 실행
  - 정수 변수 j가 i + 1부터 number.length - 1까지 도는 반복문 실행
    - 정수 변수 k가 j + 1부터 number.length - 1까지 도는 반복문 실행
      - (i < j < k가 되는 것이 포인트)
      - number[i] + number[j] + number[k] == 0의 조건식 만족 시 answer++ 실행
- answer 리턴