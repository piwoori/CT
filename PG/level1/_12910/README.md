# [level1] 나누어 떨어지는 숫자 배열 - 12910

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12910)

### 분류
- ArrayList
- 배열

### 문제 요약
- 자연수를 담은 배열 arr, 자연수 divisor 매개변수
  - 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j]
  - array는 길이 1 이상인 배열
- array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열 리턴
- divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 리턴

### 풀이 아이디어
- ArrayList<Integer> list를 초기화
- 정수 변수 num가 arr를 도는 반복문 실행
  - num % divisor == 0 의 조건식을 만족하면 list.add(num) 실행
- list.isEmpty()의 조건식을 만족하면 new int[]{-1} 리턴
  - 그냥 [-1]이면 안 됨
- Collections.sort(list) 실행해 오름차순 정렬
- int[] answer를 list.size() 크기로 초기화
- i가 0부터 list.size() - 1까지 도는 반복문 실행
  - answer[i]에 list.get(i) 대입
- answer 반환