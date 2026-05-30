# [level2] 롤케이크 자르기 - 132265

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/132265)

### 분류
- HashMap
- Set

### 문제 요약
- 롤케이크에 올려진 토핑들의 번호를 저장한 정수 배열 topping 매개변수
  - 1 ≤ topping의 길이 ≤ 1,000,000
  - 1 ≤ topping의 원소 ≤ 10,000
- 잘린 조각들의 크기와 올려진 토핑의 개수에 상관없이 각 조각에 동일한 가짓수의 토핑이 올라가면 공평하게 롤케이크가 나누어진 것 봄
- 롤케이크를 공평하게 자르는 방법의 수

### 풀이 아이디어
- 방법의 수를 나타내는 정수 변수 answer을 0으로 초기화
- Set<Integer> left를 HashSet 구현체로 초기화
- Map<Integer, Integer> right를 HashMap 구현체로 초기화
- 정수 변수 t가 topping을 도는 for문 실행
  - right.put(t, right.getOrDefault(t, 0) + 1) 실행
    - t에 대한 값이 없으면 0 + 1로 있으면 기존 값 + 1로 저장
- 정수 변수 i가 0부터 topping.length - 1 전까지 도는 for문 실행
  - 정수 변수 t를 topping[i]로 초기화
  - left.add(t) 실행
    - 왼쪽 롤케이크에 추가
  - right.put(t, right.get(t) - 1) 실행
    - 오른쪽 롤케이크에 하나 제거
  - right.get(t) == 0의 조건식 만족 시 right.remove(t) 실행해 제거
  - left.size() == right.size()의 조간식 만족 시 answer++ 실행해 방법의 수 추가
- answer 리턴