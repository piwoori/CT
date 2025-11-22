# [level 0] 배열 조각하기 - 181893

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181893)

### 분류
- 배열

### 문제 요약
- 정수 배열 arr와 query 매개변수
- query를 순회하면서 다음 작업을 반복
- 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라 버리기
- 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라 버리기
- 작업을 마친 후 남은 arr의 부분 배열 리턴

### 풀이 아이디어
- 반복문 이용
- 인덱스 슬라이싱 이용