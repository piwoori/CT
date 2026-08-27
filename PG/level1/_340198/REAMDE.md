# [level1] [PCCE 기출문제] 10번 / 공원 - 340198

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340198)

### 분류
- 2차원 배열

### 문제 요약
- 지민이가 가진 돗자리들의 한 변의 길이들이 담긴 정수 리스트 mats, 현재 공원의 자리 배치도를 의미하는 2차원 문자열 리스트 park 매개변수
  - 1 ≤ mats의 길이 ≤ 10
    - 1 ≤ mats의 원소 ≤ 20
    - mats는 중복된 원소를 가지지 않음
  - 1 ≤ park의 길이 ≤ 50
    - 1 ≤ park[i]의 길이 ≤ 50
    - park[i][j]의 원소는 문자열
    - park[i][j]에 돗자리를 깐 사람이 없다면 "-1", 사람이 있다면 알파벳 한 글자로 된 값을 가짐
- 공원에는 이미 돗자리를 깔고 여가를 즐기는 사람들이 많아 지민이가 깔 수 있는 가장 큰 돗자리가 어떤 건지 확인하려 함
- 지민이가 깔 수 있는 가장 큰 돗자리의 한 변 길이 리턴
  - 아무런 돗자리도 깔 수 없는 경우 -1 리턴

### 풀이 아이디어
- Arrays.sort(mats) 실행해 오름차순 정렬
- 공원의 가로 길이를 나타내는 정수 변수 row를 park.length로 초기화
- 공원의 세로 길이를 나타내는 정수 변수 col을 park[0].length로 초기화
- 정수 변수 i가 mats.length - 1부터 0 이상일 때까지 1씩 감소하며 도는 for문 실행
  - 큰 사이즈의 돗자리부터 확인
  - 돗자리의 크기를 나타내는 정수 변수 size를 mats[i]로 초기회
  - 정수 변수 r이 0부터 row - size까지 도는 for문 실행
    - 정수 변수 c가 0부터 col - size까지 도는 for문 실행
      - 돗자리를 필 수 있는지 확인하는 불리언 변수 possilbe을 true로 초기화
      - 정수 변수 x가 r부터 r + size 전까지 도는 for문 실행
        - 정수 변수 y가 c부터 c + size 전까지 도는 for문 실행
          - !park[x][y].equals("-1") 조건식 만족 시
            - possible에 false 대입 후 break 실행
        - !possible 조건식 만족 시 
          - break 실행
      - possible 조건식 만족 시
        - size 리턴
- -1 리턴