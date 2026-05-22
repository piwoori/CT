# [level2] H-Index - 42747

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42747)

### 분류
- 배열

### 문제 요약
- 어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations 매개변수
  - 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하
  - 논문별 인용 횟수는 0회 이상 10,000회 이하
- H-Index는 과학자의 생산성과 영향력을 나타내는 지표
- 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index
- 이 과학자의 H-Index 리턴

### 풀이 아이디어
- Arrays.sort(citations) 으로 오름차순 정렬
- 정수 변수 n을 citations.length로 초기화
- 정수 변수 i가 0부터 n - 1까지 도는 for문 실행
  - 정수 변수 h를 n - i로 초기화
  - citations[i] >= h의 조건식을 만족히면 h 리턴
- 0 리턴