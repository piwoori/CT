# [level 0] 빈 배얄에 추가, 삭제하기 - 181860

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181860)

### 분류
- 리스트

### 문제 요약
- 길이가 같은 정수 배열 arr과 boolean 배열 flag 매개변수
- flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가
- flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거
- 리스트 리턴

### 풀이 아이디어
- 반복문 이용
- enumerate() 이용
- +=로 확장
- pop() 이용