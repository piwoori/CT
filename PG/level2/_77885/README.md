# [level2] 2개 이하로 다른 비트 - 77885

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/77885)

### 분류
- 이진수

### 문제 요약
- 정수들이 담긴 배열 numbers 매개변수
  - 1 ≤ numbers의 길이 ≤ 100,000
  - 0 ≤ numbers의 모든 수 ≤ 10^15
- 양의 정수 x에 대한 함수 f(x)를 다음과 같이 정의
  - x보다 크고 x와 비트가 1~2개 다른 수들 중에서 제일 작은 수
- numbers의 모든 수들에 대하여 각 수의 f 값을 차례대로 담은 배열 리턴

### 풀이 아이디어
- long 타입 정수 배열을 numbers.length 크기로 초기화
- 정수 변수 i가 0부터 numbers.length 전까지 도는 for문 실행
  - 짝수일 때를 나타내는 numbers[i] % 2 == 0 조건식 만족 시
    - answer[i]에 numbers[i] + 1 대입
  - 홀수일 때는
    - 문자열 binary에 "0" + Long.toBinaryString(numbers[i]) 대입
      - 예를 들어, 7은 111이기에 0을 찾을 수 없어 앞에 0을 붙임
    - 오른쪽에서 가장 가까이 있는 0의 인덱스를 나타내는 정수 변수 index를 binary.lastIndexOf("0")로 초기화
    - binary에 binary.substring(0, index) + "10" + binary.substring(index + 2) 대입
      - 0이 시작 되기 전까지는 그래도, 0과 그 다음 숫자 1을 뒤집은 10, 그 뒤는 항상 1 하나만 남기에 index + 2로 붙임
    - answer[i]에 Long.parseLong(binary, 2) 대입
      - 이진수를 정수로 변경
- answer 리턴