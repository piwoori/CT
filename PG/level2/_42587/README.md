# [level2] 프로세스 - 42587

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42587)

### 분류
- Queue

### 문제 요약
- 현재 실행 대기 큐(Queue)에 있는 프로세스의 중요도가 순서대로 담긴 배열 priorities와, 몇 번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 location 매개변수
  - priorities의 길이는 1 이상 100 이하
    - priorities의 원소는 1 이상 9 이하의 정수
    - priorities의 원소는 우선순위를 나타내며 숫자가 클 수록 우선순위가 높음
  - location은 0 이상 (대기 큐에 있는 프로세스 수 - 1) 이하의 값을 가짐
    - priorities의 가장 앞에 있으면 0, 두 번째에 있으면 1 … 과 같이 표현
- 운영체제의 역할 중 하나는 컴퓨터 시스템의 자원을 효율적으로 관리하는 것
- 운영체제가 다음 규칙에 따라 프로세스를 관리할 경우 특정 프로세스가 몇 번째로 실행되는지 알아내면 됨
  - 1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
  - 2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
  - 3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
    - 3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
- 해당 프로세스가 몇 번째로 실행되는지 리턴

### 풀이 아이디어
- Queue<int[]> queue을 LinkedList 구현체로 초기화
- 정수 변수 i가 0부터 priorities.length 전까지 도는 for문 실행
  - queue.offer(new int[]{i, priorities[i]}) 실행
- 정수 변수 order을 0으로 초기화
- !queue.isEmpty() 조건식을 만족하는 while문 실행
  - 정수 배열 current을 queue.poll()로 초기화
  - 불리언 변수 hasHigher를 false로 초기화
  - 정수 배열 q가 queue를 도는 for문 실행
    - q[1] > current[1] 조건식 만족 시
      - hasHigher에 true 대입 후 break 실행
  - hasHigher 조건식 만족 시
    - queue.offer(current) 실행
  - 그 외일 때는
    - order++ 실행
    - current[0] == location 조건식 만족 시
      - order 리턴
- -1 리턴