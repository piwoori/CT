# [level1] 추억 점수 - 176963

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/176963)

### 분류
- HashMap

### 문제 요약
- 그리워하는 사람의 이름을 담은 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning, 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo 매개변수
  - 3 ≤ name의 길이 = yearning의 길이≤ 100
    - 3 ≤ name의 원소의 길이 ≤ 7
    - name의 원소들은 알파벳 소문자로만 이루어져 있음
    - name에는 중복된 값이 들어가지 않음
    - 1 ≤ yearning[i] ≤ 100
    - yearning[i]는 i번째 사람의 그리움 점수
  - 3 ≤ photo의 길이 ≤ 100
    - 1 ≤ photo[i]의 길이 ≤ 100
    - 3 ≤ photo[i]의 원소(문자열)의 길이 ≤ 7
    - photo[i]의 원소들은 알파벳 소문자로만 이루어져 있음
    - photo[i]의 원소들은 중복된 값이 들어가지 않음
- 사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됨
- 사진들의 추억 점수를 photo에 주어진 순서대로 담은 배열 리턴
   
### 풀이 아이디어
- 사진들의 추억 점수를 담을 정수 배열 answer을 phoro 베열의 크기로 초기화
- 인물과 해당 점수를 담을 Map<String, Integer> map 초기화
- 정수 변수 i가 0부터 photo.length 전까지 도는 for문 실행
  - map.put(name[i], yearning[i]) 실행해 인물과 점수 매칭
- 정수 변수 i가 0부터 photo.length 전까지 도는 for문 실행
  - 각 사진의 점수를 나타낼 정수 변수 num을 0으로 초기화
  - 문자열 변수 p가 photo[i]를 도는 for문 실행
    - num에 map.getOrDefault(p, 0) 더하기 실행
  - answer[i]에 num 대입
- answer 리턴