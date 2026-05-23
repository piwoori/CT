# [level1] 같은 숫자는 싫어 - 12906

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12906)

### 분류
- ArrayList
- 배열

### 문제 요약
- 정수 배열 arr 매개변수
  - 각 원소는 숫자 0부터 9까지로 구성
  - 배열 arr의 크기 : 1,000,000 이하의 자연수
- 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
- 거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지
- 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들 리턴

### 풀이 아이디어
- ArrayList<Integer> list를 초기화
  - 일단 크기를 확정할 수 없기에
- list.add(arr[0]) 실행해 첫 원소만 일단 추가
- 정수 변수 i가 1부터 arr.length - 1까지 도는 for문 실행
  - arr[i] != arr[i - 1]의 조건식 만족 시
    - list.add(arr[i]) 실행 해 list에 추가
- 정수 배열 answer를 list.size() 크기로 초기화
- 정수 변수 i가 0부터 list.size() - 1까지 도느 for문 실행
  - answer[i]에 list.get(i) 대입
- answer 리턴