# [level1] 제일 작은 수 제거하기 - 12935

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12935)

### 분류
- 배열

### 문제 요약
- 정수를 저장한 배열 arr 매개변수
  - 길이 1 이상인 배열
  - 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j]
- arr 에서 가장 작은 수를 제거한 배열 리턴
- 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1 채워 리턴

### 풀이 아이디어
- arr.length == 1 조건식 만족하면 new int[]{-1} 리턴
- 정수 변수 min을 Integer.MAX_VALUE로 초기화
- 정수 변수 num이 arr를 도는 반복문 실행
  - min에 Math.min(min, num) 대입
- 정수 배열 answer을 arr.length - 1 크기로 초기화
- 정수 변수 idx를 0으로 초기화
- 정수 변수 num이 arr를 도는 반복문 실행 
  - num != min의 조건식을 만족하면 answer[idx++]에 num 대입
- answer 리턴