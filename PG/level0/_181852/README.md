# [level 0] 뒤에서 5등 위로 - 181852

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181852)

### 분류
- 리스트

### 문제 요약
- 정수로 이루어진 리스트 num_list 매개변수
- num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트 리턴

### 풀이 아이디어
- 기존 리스트 변경하지 않고 반환이 되는 sorted() 이용
- .sort()는 반환 안 됨 + 단독 실행문으로 써야 함
- 리스트 슬라이싱 이용