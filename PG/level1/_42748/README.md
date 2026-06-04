# [level1] K번째수 - 42748

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42748)

### 분류
- 배열

### 문제 요약
- 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands 매개변수
  - array의 길이는 1 이상 100 이하
  - array의 각 원소는 1 이상 100 이하
  - commands의 길이는 1 이상 50 이하
  - commands의 각 원소는 길이가 3
- 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수룰 배열에 담아 리턴

### 풀이 아이디어
- 연산을 적용한 결과를 담을 commands.length 크기의 정수 배열 answer 초기화
- 정수 변수 i가 0부터 commands.length 전까지 도는 for문 실행
  - [i, j, k]의 i를 나타내는 정수 변수 start를 commands[i][0]로 초기화
  - [i, j, k]의 j를 나타내는 정수 변수 end를 commands[i][1]로 초기화
  - [i, j, k]의 k를 나타내는 정수 변수 k를 commands[i][2]로 초기화
  - 정수 배열 list를 Arrays.copyOfRange(array, start - 1, end)로 초기회
    - array 배열을 start - 1 부터 end 전까지의 구간을 잘라 새롭게 복사
  - Arrays.sort(list) 실행해 오름차순 정렬
  - answer[i]에 list[k - 1] 대입
- answer 리턴