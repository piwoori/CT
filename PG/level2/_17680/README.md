# [level2] [1차] 캐시 - 17680

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/17680)

### 분류
- ArrayList

### 문제 요약
- 캐시 크기(cacheSize)와 도시이름 배열(cities) 매개변수
  - cacheSize는 정수이며, 범위는 0 ≦ cacheSize ≦ 30
  - cities는 도시 이름으로 이뤄진 문자열 배열로, 최대 도시 수는 100,000개
  - 각 도시 이름은 공백, 숫자, 특수문자 등이 없는 영문자로 구성되며, 대소문자 구분을 하지 않는다. 도시 이름은 최대 20자로 이루어짐
- 캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용
- cache hit일 경우 실행시간은 1
- cache miss일 경우 실행시간은 5
- DB 캐시를 적용할 때 캐시 크기에 따른 실행시간 리턴

### 풀이 아이디어
- 실행시간을 나타내는 정수 변수 answer을 0으로 초기화
- ArrayList<String> cache 초기화
- 문자열 변수 city가 cities를 도는 for문 실행
  - city에 city.toLowerCase(city) 대입해 다 소문자로 변경
  - cache hit 때인 cache.contains(city)의 조건식을 만족하면
    - cache.remove(city) 실행해 캐시 제거 후
    - cache.add(city) 실행해 다시 캐시 추가
    - 시간 추가 위해 answer += 1 실행
  - cache miss 때면
    - cacheSize > 0 && cache.size() >= cacheSize의 조건식 만족하면
      - cache.remove(0) 실행해 가장 오래된 캐시 제거
    - cacheSize > 0의 조건식 만족하면
      - cache.add(city) 실행
    - answer += 5 실행
- answer 리턴