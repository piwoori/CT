# [level1] 키패드 누르기 - 67256

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/67256)

### 분류
- ArrayList

### 문제 요약
- 순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand 매개변수
  - numbers 배열의 크기는 1 이상 1,000 이하
  - numbers 배열 원소의 값은 0 이상 9 이하인 정수
  - hand는 "left" 또는 "right"
    - "left"는 왼손잡이, "right"는 오른손잡이를 의미
- 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력
- 맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작
- 엄지손가락을 사용하는 규칙은 다음과 같음
  - 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당
  - 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용
  - 오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용
  - 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용
    - 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용
- 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 리턴
  - 왼손 엄지손가락을 사용한 경우는 L, 오른손 엄지손가락을 사용한 경우는 R을 순서대로 이어붙여 문자열 형태로

### 풀이 아이디어
- 사용된 손가락을 담기 위해 StringBuilder answer 초기화
- *을 숫자로 나타내기 위해 정수 변수 left를 10으로 초기화
- #을 숫자로 나타내기 위해 정수 변수 right를 12로 초기화
- 정수 변수 num이 numbers를 도는 for문 실행
  - num == 0 조건식 만족 시
    - num에 11 대입
  - num == 1 || num == 4 || num == 7 조건식 만족 시
    - answer.append("L") 실행
    - left에 num 대입
  - num == 3 || num == 6 || num == 9 조건식 만족 시
    - answer.append("R") 실행
    - right에 num 대입
  - 그 외일 때는
    - 왼손과의 거리를 나타내는 정수 변수 leftD를 Math.abs(left - num) / 3 + Math.abs(left - num) % 3로 초기화
    - 오른손과의 거리를 나타내는 정수 변수 rightD를 Math.abs(right - num) / 3 + Math.abs(right - num) % 3로 초기화
    - leftD < rightD 조건식 만족 시
      - 왼손과의 거리가 짧기 때문에
      - answer.append("L") 실행
      - left에 num 대입
    - leftD > rightD 조건식 만족 시
      - 오른손과의 거리가 짧기 때문에
      - answer.append("R") 실행
      - right에 num 대입
    - 그 외일 때는
      - hand.equals("right") 조건식 만족 시
        - answer.append("R") 실행
        - right에 num 대입
      - 그 외일 때는
        - answer.append("L") 실행
        - left에 num 대입
- answer.toString() 리턴