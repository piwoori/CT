# [level1] 실패율 - 42889

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42889)

### 분류
- 리스트

### 문제 요약
- 전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages 매개변수
  - 스테이지의 개수 N은 1 이상 500 이하의 자연수
  - stages의 길이는 1 이상 200,000 이하
  - stages에는 1 이상 N + 1 이하의 자연수가 담겨 있음
    - 각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타냄
    - N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타냄
- 각 스테이지의 실패율은 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수로 정의
- 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 됨
- 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의
- 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열 리턴

### 풀이 아이디어
- 정수 배열을 리턴하고 정수 변수 N과 정수 배열 stages를 매개변수로 하는 solution 메소드 정의
  - 정수 배열 answer을 N 크기로 정의
  - 정수 변수 players를 stages.length로 초기화
  - List<Stage> list를 ArrayList 구현체로 초기화
  - 정수 변수 i가 1부터 N까지 도는 for문 실행
    - 스테이지 도달 실패한 수를 나타내는 정수 변수 count을 0으로 초기화
    - 정수 변수 stage가 stages를 도는 for문 실행
      - stage == i 조건식 만족 시 count++ 실행
    - 실패율을 나타내는 실수 변수 failRate를 0으로 초기화
    - players > 0 조건식 만족 시 
      - failRate에 (double) count / players 대입
    - list.add(new Stage(i, failRate)) 실행
    - players -= count 실행
  - Collections.sort(list, (a, b) 람다식 실행
    - b.failRate == a.failRate 조건식 만족 시 a.num - b.num 리턴
    - 기본적으로는 Double.compare(b.failRate, a.failRate) 리턴
  - 정수 변수 i가 0부터 N 전까지 도는 for문 실행
    - answer[i]에 list.get(i).num 대입
  - answer 리턴
- Stage 클래스 정의
  - 정수 변수 num, 실수 변수 failRate 초기화
  - Stage 객체를 생성자를 통해 초기화