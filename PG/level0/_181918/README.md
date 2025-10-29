# [level 0] 배열 만들기 4 - 181918

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181918)

### 분류
- 반복문
- 조건문

### 문제 요약
- 정수 배열 arr 매개변수
- 변수 i 0으로 초기화
- i가 arr의 길이보다 작으면 다음 작업을 반복
    - stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더하기
    - stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더하기
    - stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거
- stk 리턴

### 풀이 아이디어
- if문 이용
- while문 이용
- 리스트 마지막 원소 없애는 함수 pop() 이용