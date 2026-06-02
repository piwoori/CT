# [level1] 두 개 뽑아서 더하기- 68644

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/68644)

### 분류
- Set
- ArratList

### 문제 요약
- 정수 배열 numbers 매개변수
  - numbers의 길이는 2 이상 100 이하
  - numbers의 모든 수는 0 이상 100 이하
- numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 리턴

### 풀이 아이디어
- Set<Integer> set을 HashSet 구현체로 초기화
- 정수 변수 i가 0부터 numbers.length 전까지 도는 for문 실행
  - 정수 변수 j가 i + 1부터 numbers.length 전까지 도는 for문 실행
    - set.add(numbers[i] + numbers[j]) 실행
- 정수 배열 answer를 set.size()로 초기화
- 인덱스를 나타내는 정수 변수 idx를 0으로 초기화
  - set은 인덱스가 없기 때문에 set[i] 이런 식으로 접근 불가
- 정수 변수 num이 set을 도는 for문 실행
  - answer[idx++]에 num 대입
- Arrays.sort(answer) 실행해 오름차순 정렬
- answer 리턴