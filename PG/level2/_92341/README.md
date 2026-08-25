# [level2] 주차 요금 계산 - 92341

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/92341)

### 분류
- HashMap

### 문제 요약
- 주차 요금을 나타내는 정수 배열 fees, 자동차의 입/출차 내역을 나타내는 문자열 배열 records 매개변수
  - fees의 길이 = 4
    - fees[0] = 기본 시간(분)
    - 1 ≤ fees[0] ≤ 1,439
    - fees[1] = 기본 요금(원)
    - 0 ≤ fees[1] ≤ 100,000
    - fees[2] = 단위 시간(분)
    - 1 ≤ fees[2] ≤ 1,439
    - fees[3] = 단위 요금(원)
    - 1 ≤ fees[3] ≤ 10,000
  - 1 ≤ records의 길이 ≤ 1,000
    - records의 각 원소는 "시각 차량번호 내역" 형식의 문자열
    - 시각, 차량번호, 내역은 하나의 공백으로 구분
    - 시각은 차량이 입차되거나 출차된 시각을 나타내며, HH:MM 형식의 길이 5인 문자열
      - HH:MM은 00:00부터 23:59까지 주어짐
      - 잘못된 시각("25:22", "09:65" 등)은 입력으로 주어지지 않음
    - 차량번호는 자동차를 구분하기 위한, `0'~'9'로 구성된 길이 4인 문자열
    - 내역은 길이 2 또는 3인 문자열로, IN 또는 OUT
    - IN은 입차를, OUT은 출차를 의미
    - records의 원소들은 시각을 기준으로 오름차순으로 정렬되어 주어짐
    - records는 하루 동안의 입/출차된 기록만 담고 있으며, 입차된 차량이 다음날 출차되는 경우는 입력으로 주어지지 않음
    - 같은 시각에, 같은 차량번호의 내역이 2번 이상 나타내지 않음
    - 마지막 시각(23:59)에 입차되는 경우는 입력으로 주어지지 않음
    - 아래의 예를 포함하여, 잘못된 입력은 주어지지 않음
      - 주차장에 없는 차량이 출차되는 경우
      - 주차장에 이미 있는 차량(차량번호가 같은 차량)이 다시 입차되는 경우
- 어떤 차량이 입차된 후에 출차된 내역이 없다면, 23:59에 출차된 것으로 간주
- 00:00부터 23:59까지의 입/출차 내역을 바탕으로 차량별 누적 주차 시간을 계산하여 요금을 일괄로 정산
- 누적 주차 시간이 기본 시간이하라면, 기본 요금을 청구
- 누적 주차 시간이 기본 시간을 초과하면, 기본 요금에 더해서, 초과한 시간에 대해서 단위 시간 마다 단위 요금을 청구
  - 초과한 시간이 단위 시간으로 나누어 떨어지지 않으면, 올림하여 계산
  - ⌈a⌉ : a보다 작지 않은 최소의 정수를 의미
- 차량 번호가 작은 자동차부터 청구할 주차 요금을 차례대로 담은 정수 배열 리턴

### 풀이 아이디어
- 정수 배열 fees와 문자열 배열 records을 매개변수로 하고 정수 배열을 리턴하는 solution 메소드 정의
  - 입차한 차량 번호와 시간을 저장할 Map<String, Integer> inTime을 HashMap 구현체로 초기화
  - 주차한 차량 번호와 총 시간을 저장할 Map<String, Integer> totalTime을 HashMap 구현체로 초기화
  - 문자열 record가 정수 배열 records를 도는 for문 실행
    - 문자열 배열 parts를 record.split(" ")로 초기화
    - 문자열 변수 time을 parts[0]으로 초기화
    - 문자열 변수 car을 parts[1]으로 초기화
    - 문자열 변수 type을 parts[2]으로 초기화
    - 정수 변수 minute을 (car, minute)로 초기화
    - type.equals("IN") 조건식 만족 시
      - inTime.put(car, minute) 실행
    - 그 외일 때는
      - 정수 변수 start를 inTime.get(car)로 초기화
      - 정수 변수 parkingTime를 minute - start로 초기화
      - totalTime.put(car, totalTime.getOrDefault(car, 0) + parkingTime) 실행
      - inTime.remove(car) 실행해 입차 시간 삭제
  - 출차 시각이 없는 차량을 위해 정수 변수 lastTime을 toMinute("23:59")로 초기화
  - 문자열 변수 car이 inTime.keySet()을 도는 for문 실행
    - 정수 변수 parkingTime을 lastTime - inTime.get(car)로 초기화
    - totalTime.put(car, totalTime.getOrDefault(car, 0) + parkingTime) 실행
  - List<String> cars을 totalTime.keySet() 크기로 초기화
  - Collections.sort(cars) 실행해 오름차순 정렬
  - 정수 변수 answer을 cars.size()로 초기화
  - 정수 변수 i가 0부터 cars.size() 전까지 도는 for문 실행
    - 정수 변수 time을 totalTime.get(cars.get(i))로 초기회
    - time <= fees[0] 조건식 만족 시
      - answer[i]에 fees[1] 대입
    - 그 외일 때는
      - answer[i]에 fees[1] +(int) Math.ceil((double) (time - fees[0]) / fees[2]) * fees[3] 대입
  - answer 리턴
- 문자열 변수 time을 매개변수로 하고 정수를 반환하는 toMinute 메소드 정의
  - 문자열 배열 parts를 time.split(":")으로 초기화
  - 정수 변수 hour을 Integer.parseInt(parts[0])로 초기화
  - 정수 변수 minute을 Integer.parseInt(parts[1])로 초기화
  - hour * 60 + minute 리턴