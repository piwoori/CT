# [level2] 더 맵게 - 42626

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42626)

### 분류
- PriorityQueue

### 문제 요약
- Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K 매개변수
  - scoville의 길이는 2 이상 1,000,000 이하
  - K는 0 이상 1,000,000,000 이하
  - scoville의 원소는 각각 0 이상 1,000,000 이하
- 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듦
  - 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
- Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞음
- 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수 리턴
  - 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1 리턴

### 풀이 아이디어
- 최소 힙으로 동작해 가장 작은 값이 앞으로 오는 PriorityQueue<Integer> pq 초기화
- 정수 변수 num이 scovile 배열을 도는 for문 실행
  - pq.add(num) 실행 해 값 추가
- 섞는 횟수를 나타내는 정수 변수 answer를 0으로 초기화
- pq.peek() < 2 조건식 만족하는 while문 실행
  - pq.size() < 2 조건식 만족 시
    - -1 리턴
  - 정수 변수 first를 pq.poll()로 초기화
  - 정수 변수 second를 pq.poll()로 초기화
  - 정수 변수 mixed를 first + (second * 2)로 초기화
  - answer++ 실행
  - pq.add(mixed) 실행 해 값 추가
- answer 리턴