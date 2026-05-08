# [level2] 구명보트 - 42885

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42885)

### 분류
- 배열

### 문제 요약
- 사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit 매개변수
  - 사람은 1명 이상 50,000명 이하
  - 각 사람의 몸무게는 40kg 이상 240kg 이하
  - 구명보트의 무게 제한은 40kg 이상 240kg 이하
  - 구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댓값보다 크게 주어지므로 사람들을 구출할 수 없는 경우는 없음
- 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없음
- 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값 리턴

### 풀이 아이디어
- Arrays.sort(people)로 오름차순 정렬
- 구명보트 개수를 나타내는 정수 변수 answer을 0으로 초기화
- 왼쪽부터 시작하는 정수 변수 left을 0으로 초기화
- 오른쪽부터 시작하는 정수 변수 right를 people.length -1으로 초기화
- left <= right의 조건식을 만족하는 while문 실행
  - people[left] + people[right] <= limit 조건식을 만족하면
    - left++ 실행해 가장 가벼운 사람도 태움
  - 항상 right-- 실행, answer++ 실행
- 마지막으로 answer 리턴