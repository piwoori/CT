# [level2] 방문 길이 - 49994

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/49994)

### 분류
- set

### 문제 요약
- 명령어 dirs 매개변수
  - dirs는 string형으로 주어지며, 'U', 'D', 'R', 'L' 이외에 문자는 주어지지 않음
  - dirs의 길이는 500 이하의 자연수
- 게임 캐릭터를 4가지 명령어를 통해 움직이려함
- 명령어는 다음과 같음
  - U: 위쪽으로 한 칸 가기
  - D: 아래쪽으로 한 칸 가기
  - R: 오른쪽으로 한 칸 가기
  - L: 왼쪽으로 한 칸 가기
- 캐릭터는 좌표평면의 (0, 0) 위치에서 시작
- 좌표평면의 경계는 왼쪽 위(-5, 5), 왼쪽 아래(-5, -5), 오른쪽 위(5, 5), 오른쪽 아래(5, -5)로 이루어져 있음 
- 좌표평면의 경계를 넘어가는 명령어는 무시
-  게임 캐릭터가 처음 걸어본 길의 길이 리턴

### 풀이 아이디어
- 길의 길이를 저장할 Set<String> set을 HashSet 구현체로 초기화
- 좌표를 나타내는 정수 변수 x와 y를 각각 0으로 초기화
- 문자 변수 c가 dirs.toCharArray()를 도는 for문 실행
  - 정수 변수 nx를 x로 초기화
  - 정수 변수 ny를 y로 초기화
  - switch(c) 실행
    - case 'U'일 때는 ny++ 실행 후 break 실행
    - case 'D'일 때는 ny-- 실행 후 break 실행
    - case 'L'일 때는 nx-- 실행 후 break 실행
    - case 'R'일 때는 nx++ 실행 후 break 실행
  - 정해진 좌표평면을 넘는 nx < -5 || nx > 5 || ny < -5 || ny > 5 조건식 만족 시 continue 실행
  - 문자열 변수 path를 x + "," + y + "," + nx + "," + ny로 초기화
  - 문자열 변수 reverse를 nx + "," + ny + "," + x + "," + y로 초기화
  - !set.contains(path) 조건식 만족 시
    - set.add(path) 실행
    - set.add(reverse) 실행
  - x에 nx 대입
  - y에 ny 대입
- set.size() / 2 리턴