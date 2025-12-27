# [level 0] 배열 만들기 6 - 181859

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181859)

### 분류
- 리스트

### 문제 요약
- 0과 1로만 이루어진 정수 배열 arr 매개변수
- i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복
- 만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더함
- stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더함 
- stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더함
- 위 작업을 마친 후 만들어진 stk 리턴, 빈 배열일 땐 [-1] 리턴

### 풀이 아이디어
- append() 이용
- pop() 이용
- return or(true일 땐 전자, false일 땐 후자 리턴) 이용