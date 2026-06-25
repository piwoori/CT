# [level1] 로또의 최고 순위와 최저 순위 - 77484

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/77484)

### 분류
- Set

### 문제 요약
- 민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums 매개변수
  - lottos는 길이 6인 정수 배열
  - lottos의 모든 원소는 0 이상 45 이하인 정수
    - 0은 알아볼 수 없는 숫자를 의미
    - 0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않음
    - lottos의 원소들은 정렬되어 있지 않을 수도 있음
  - win_nums은 길이 6인 정수 배열
  - win_nums의 모든 원소는 1 이상 45 이하인 정수
    - win_nums에는 같은 숫자가 2개 이상 담겨있지 않음
    - win_nums의 원소들은 정렬되어 있지 않을 수도 있음
- 로또의 순위를 정하는 방식
  - 1위: 6개 번호가 모두 일치
  - 2위:	5개 번호가 일치
  - 3위:	4개 번호가 일치
  - 4위:	3개 번호가 일치
  - 5위:	2개 번호가 일치
  - 6(낙첨)위: 그 외
- 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었음
- 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아 리턴

### 풀이 아이디어
- 정수 배열을 리턴하고 정수 배열 lottos와 정수 배열 win_nums를 매개변수로 하는 solution 메소드 정의
  - Set<Integer> set를 HashSet 구현체로 초기화
  - 민우의 로또 숫자 중 0의 개수를 나타내는 정수 변수 zeroCount를 0으로 초기화
  - 민우의 로또 숫자 중 당첨 개수를 나타내는 정수 변수 matchCount를 0으로 초기화
  - 정수 변수 num이 win_nums를 도는 for문 실행
    - set.add(num) 실행
  - 정수 변수 num이 lottos를 도는 for문 실행
    - num == 0 조건식 만족 시 zeroCount++ 실행
    - set.contains(num) 조건식 만족 시 matchCount++ 실행
  - 최고 순위를 나타내는 정수 변수 best를 getBank(zeroCount + matchCount)로 초기화
  - 최저 순위를 나타내는 정수 변수 worst를 getBank(matchCount)로 초기화
  - new int[]{best, worst} 리턴
- 정수를 반환하고 정수 변수 count를 매개변수로 하는 getRank 메소드 정의
  - switch(count) 실행
    - case 6일 때는 1 반환
    - case 5일 때는 2 반환
    - case 4일 때는 3 반환
    - case 3일 때는 4 반환
    - case 2일 때는 5 반환
    - default일때는 6 반환