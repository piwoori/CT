# [level2] 기능개발 - 42586

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42586)

### 분류
- ArrayList

### 문제 요약
- 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds 매개변수
  - 작업의 개수(progresses, speeds배열의 길이)는 100개 이하
  - 작업 진도는 100 미만의 자연수
  - 작업 속도는 100 이하의 자연수
  - 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정
- 각 기능은 진도가 100%일 때 서비스에 반영할 수 있음
- 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포
- 각 배포마다 몇 개의 기능이 배포되는지를 담은 배열 리턴

### 풀이 아이디어
- ArrayList<Integer> list 초기화
- 정수 변수 prevDay와 count를 각각 0으로 초기화
- 정수 변수 i가 0부터 progresses.length - 1까지 도는 for문 실행
  - 정수 변수 day를 (int) Math.ceil(100.0 - progresses[i] / speed[i])로 초기화
    - ceil() 이용해 올림
  - day > prevDay의 조건식을 만족할 시
    - count > 0의 조건식을 만족할 시
      - list.add(count) 실행
    - prevDay에 day 대입
    - count에 1 대입해 원래대로 
  - 아닐 시 count++ 실행
- list.add(count) 실행해 마지막 갯수 추가
- 정수 배열 answer를 list.size() 크기로 초기화
- 정수 변수 i가 0부터 list.size() - 1까지 도는 for문 실행
  - answer[i]에 list.get(i) 대입
- answer 리턴