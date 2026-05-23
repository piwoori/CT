# [level4] 무지의 먹방 라이브 - 42891

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42891)

### 분류
- ArrayList
- PriorityQueue

### 문제 요약
- 각 음식을 모두 먹는데 필요한 시간이 담겨있는 배열 food_times, 네트워크 장애가 발생한 시간 K 초 매개변수
  - food_times 는 각 음식을 모두 먹는데 필요한 시간이 음식의 번호 순서대로 들어있는 배열
  - k 는 방송이 중단된 시간
  - food_times 의 길이는 1 이상 2,000 이하
  - food_times 의 원소는 1 이상 1,000 이하의 자연수
  - k는 1 이상 2,000,000 이하의 자연수
- 회전판에 먹어야 할 N 개의 음식 존재
- 각 음식에는 1부터 N 까지 번호가 붙어있으며, 각 음식을 섭취하는데 일정 시간이 소요
- 무지는 다음과 같은 방법으로 음식을 섭취
  - 무지는 1번 음식부터 먹기 시작하며, 회전판은 번호가 증가하는 순서대로 음식을 무지 앞으로 가져다 놓음
  - 마지막 번호의 음식을 섭취한 후에는 회전판에 의해 다시 1번 음식이 무지 앞으로 옴
  - 무지는 음식 하나를 1초 동안 섭취한 후 남은 음식은 그대로 두고, 다음 음식을 섭취
    - 다음 음식: 아직 남은 음식 중 다음으로 섭취해야 할 가장 가까운 번호의 음식
  - 회전판이 다음 음식을 무지 앞으로 가져오는데 걸리는 시간은 없다고 가정
- 무지가 먹방을 시작한 지 K 초 후에 네트워크 장애로 인해 방송이 잠시 중단
- 네트워크 정상화 후 몇 번 음식부터 다시 섭취하면 되는지 리턴
- 만약 더 섭취해야 할 음식이 없다면 -1 리턴

### 풀이 아이디어
- Comparable<Food>를 구현한 Food 클래스 정의
  - 정수 변수 idx, time을 필드로 선언(음식 번호, 음식 시간)
    - cf) 필드: 클래스 안에 선언된 변수
  - idx와 time을 초기화하는 Food 생성자 정의
  - compareTo 메소드 오버라이딩으로 Food 객체의 정렬 기준 정의
    - time - o.time 리턴해 time 기준 오름차순 정렬
- int[] food_times, long k을 매개변수로 하고 정수를 반환하는 solution 메소드 정의
  - long 타입 정수 변수 total를 0으로 초기화
  - 정수 변수 food가 food_times를 도는 for문 실행
    - total에 food 더함
  - total <= k의 조건식 만족하면 -1 리턴
  - PriorityQueue<Food> pq 초기화
  - 정수 변수 i가 0부터 food_times.length - 1까지 도는 for문 실행
    - pq.offer(new Food(i + 1, food_times[i])) 실행
    - 생성된 Food 객체를 PriorityQueue에 삽입
    - 각 음식은 1부터 N 까지 번호를 가지므로 i + 1
    - compareTo() 기준으로 time 오름차순 자동 정렬
  - long 타입 정수 변수 prev를 0으로 초기화
    - 이전에 제거한 음식 시간 층을 의미
  - long 타입 정수 변수 remain을 food_times.length으로 초기화
    - 현재 남아있는 음식 개수를 의미
  - !pq.isEmpty()의 조건식을 가진 while문 실행
    - long 타입 정수 변수 now를 pq.peek().time로 초기화
      - 현재 남은 음식 중 시간이 가장 적은 음식의 time
    - long 타입 정수 변수 spend를 (now - prev) * remain로 초기화
      - 현재 층에서 now 층까지 남은 음식들을 한 번에 먹는 데 필요한 시간을 의미
    - k >= spend의 조건식 만족 시
      - k -= spend 실행 해 걸린 시간 차감
      - prev에 now 대입
      - !pq.isEmpty() && pq.peek().time == now의 조건식을 가진 while문 실행
        - pq.poll() 실행 해 끝난 음식 제거
        - remain-- 실행 해 음식 갯수 줄이기
    - 그 외는 더 이상 한 층을 통째로 제거할 수 없으므로 break 실행
  - 남은 음식들을 저장하기 위해 ArrayList<Food> list를 pq로 초기화
  - list.sort((a, b) -> a.idx - b.idx) 실행
    - 람다식으로 원래 음식 번호인 idx 오름차순 정렬
  - list.get((int)(k % remain)).idx 리턴
    - 남은 음식은 번호 순서대로 반복 순환하므로 k % remain 번째에 해당하는 남은 음식의 번호 계산