# [level2] 튜플 - 64065

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/64065)

### 분류
- 튜플

### 문제 요약
- 특정 튜플을 표현하는 집합이 담긴 문자열 s 매개변수
  - s의 길이는 5 이상 1,000,000 이하
  - s는 숫자와 '{', '}', ',' 로만 이루어져 있음
  - 숫자가 0으로 시작하는 경우는 없음
  - s는 항상 중복되는 원소가 없는 튜플을 올바르게 표현하고 있음
  - s가 표현하는 튜플의 원소는 1 이상 100,000 이하인 자연수
  - return 하는 배열의 길이가 1 이상 500 이하인 경우만 입력으로 주어임
- 셀수있는 수량의 순서있는 열거 또는 어떤 순서를 따르는 요소들의 모음을 튜플(tuple)이라고 함
- n개의 요소를 가진 튜플을 n-튜플(n-tuple)이라고 하며, (a1, a2, a3, ..., an)과 같이 표현할 수 있음
- 튜플은 다음과 같은 성질을 가지고 있음
  - 중복된 원소가 있을 수 있음
  - 원소에 정해진 순서가 있으며, 원소의 순서가 다르면 서로 다른 튜플임
  - 튜플의 원소 개수는 유한함
- s가 표현하는 튜플을 배열에 담아 리턴

### 풀이 아이디어
- s에 s.substring(2, s.length() - 2) 대입해 맨 양쪽의 괄호 삭제
- 문자열 배열 arr를 s.split("\\},\\{")로 초기화
- Arrays.sort(arr, (a, b) -> a.length() - b.length())의 람다식으로 배열 정렬
- List<Integer> list를 ArrayList 구현체로 초기화
- Set<Integer> set을 HashSet 구현체로 초기화
- 문자열 str이 arr를 도는 for문 실행
  - 문자열 배열 nums를 str.split(",")으로 초히과
  - 문자열 num이 nums를 도는 for문 실행
    - 정수 변수 n을 Integer.parseInt(num)로 초기화
    - !set.contains(n) 조건식 만족 시
      - set.add(n)와 list.add(n) 실행
- 표현되는 튜플을 담을 정수 배열 answer을 list.size()로 초기화
- 정수 변수 i가 0부터 list.size() 전까지 도는 for문 실행
  - answer[i]에 list.get(i) 대입
- answer 리턴