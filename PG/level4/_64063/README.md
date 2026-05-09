# [level2] 호텔 방 배정 - 64063

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/64063)

### 분류
- HashMap
- 메서드

### 문제 요약
- 전체 방 개수 k와 고객들이 원하는 방 번호가 순서대로 들어있는 배열 room_number 매개변수
    - k는 1 이상 1012 이하인 자연수
    - room_number 배열의 크기는 1 이상 200,000 이하
    - room_number 배열 각 원소들의 값은 1 이상 k 이하인 자연수
    - room_number 배열은 모든 고객이 방을 배정받을 수 있는 경우만 입력
- 방 배정 규칙
  - 한 번에 한 명씩 신청한 순서대로 방을 배정
  - 고객은 투숙하기 원하는 방 번호를 제출
  - 고객이 원하는 방이 비어 있다면 즉시 배정
  - 고객이 원하는 방이 이미 배정되어 있으면 원하는 방보다 번호가 크면서 비어있는 방 중 가장 번호가 작은 방을 배정
- 각 고객에게 배정되는 방 번호를 순서대로 담은 배열 리턴

### 풀이 아이디어
- 함수 밖에서 Map<Integer, Integer> map을 new HashMap<>() 구현체로 초기화
- long room을 매개변수로, long을 반환하는 find 함수 구현
  - 방이 비어있는 경우에 !map.containsKey(room) 조건식을 만족하면
    - map.put(room, room + 1) 실행 후 room 리턴
  - 그 외에는 비어있지 않으면 다음 방 탐색하기 위해 재귀 함수 호출
    - long 타입 변수 next에 find(map,get(room)) 대입
  - map.put(room, next)로 헛수고 하지 않게끔 경로 압축
- 주어진 solution 함수
  - long[] answer를 new long[room_number.length]로 초기화
  - i가 0부터 room_number.length -1 까지 도는 반복문 실행
  - answer[i]에 find(room_number[i]) 대입
  - 마지막으로 answer 리턴