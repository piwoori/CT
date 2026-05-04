# [level1] x만큼 간격이 있는 n개의 숫자 - 12954

[문제 링크](https://www.acmicpc.net/problem/12954)

### 분류
- 배열

### 문제 요약
- 정수 x(-10000000 이상, 10000000 이하)와 자연수 n(1000 이하) 매개변수
- x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트

### 풀이 아이디어
- n크기의 long 타입 배열 arr 초기화
- arr[0] 에 x 대입
- i가 1부터 n -1까지 도는 반복문 실행
- arr[i]에 arr[i -1] + x 대입
- arr 리턴
- cf) 만약 arr 를 출력하고 싶을 떼:
  - System.out.println(Arrays.toString(arr));
  - 배열은 객체기에 println() 하면 내부적으로 toString()이 호출됨
  - 배열의 toString()은 주소값(참조값) 형태로 출력되기에