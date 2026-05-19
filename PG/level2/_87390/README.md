# [level2] n^2 배열 자르기 - 87390

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/87390)

### 분류
- 배열

### 문제 요약
- 정수 n, left, right 매개변수 
  - 1 ≤ n ≤ 10^7
  - 0 ≤ left ≤ right < n^2
  - right - left < 10^5
- 다음 과정을 거쳐서 1차원 배열 생성
  - n행 n열 크기의 비어있는 2차원 배열 생성
  - 1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채움
  - 1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듦
  - 새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남김
- 주어진 과정대로 만들어진 1차원 배열 리턴

### 풀이 아이디어
- 정수 배열 answer를 (int)(right - left + 1) 크기로 초기화
- 정수 변수 idx를 0으로 초기화
- long 타입의 정수 변수 i가 left부터 right까지 도는 for문 실행
  - answer[idx++]에 int)Math.max(row, col) + 1 대입
- answer 리턴