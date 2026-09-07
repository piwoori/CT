# [level2] 가장 큰 수 - 42746

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42746)

### 분류
- 배열

### 문제 요약
- 0 또는 양의 정수가 담긴 배열 numbers 매개변수
  - numbers의 길이는 1 이상 100,000 이하
  - numbers의 원소는 0 이상 1,000 이하
- 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 리턴

### 풀이 아이디어
- 문자열 배열 nums를 numbers.length 크기로 초기화
- 정수 변수 i가 0부터 numbers.length 전까지 도는 for문 실행
  - nums[i]에 String.valueOf(numbers[i]) 대입
- Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b)) 실행
  - 내림차순으로 정렬하기 위해 반대로 비교
  - 문자열을 사전순읋 비교하는 메소드인 compareTo 사용
- nums의 첫 원소가 "0"이면 모든 원소가 "0"이기에 nums[0].equals("0") 조건식 만족 시
  - "0" 리턴
- StringBuilder sb 초기화
- 문자열 num이 nums를 도는 for문 실행
  - sb.append(num)
- sb.toString() 리턴