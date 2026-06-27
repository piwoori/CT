# [level1] 대충 만든 자판 - 160586

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/160586)

### 분류
- Map

### 문제 요약
- 1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과 입력하려는 문자열들이 담긴 문자열 배열 targets 매개변수
  - 1 ≤ keymap의 길이 ≤ 100
    - keymap[i]는 i + 1번 키를 눌렀을 때 순서대로 바뀌는 문자를 의미
      - 예를 들어 keymap[0] = "ABACD" 인 경우 1번 키를 한 번 누르면 A, 두 번 누르면 B, 세 번 누르면 A 가 됨
    - keymap의 원소의 길이는 서로 다를 수 있음
    - keymap의 원소는 알파벳 대문자로만 이루어져 있음
  - 1 ≤ targets의 길이 ≤ 100
    - 1 ≤ targets의 원소의 길이 ≤ 100
    - targets의 원소는 알파벳 대문자로만 이루어져 있음
- 휴대폰의 자판은 컴퓨터 키보드 자판과는 다르게 하나의 키에 여러 개의 문자가 할당될 수 있음
- 키 하나에 여러 문자가 할당된 경우, 동일한 키를 연속해서 빠르게 누르면 할당된 순서대로 문자가 바뀜
- 이 휴대폰 자판을 이용해 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지 알아보고자 함
- 단, 목표 문자열을 작성할 수 없을 때는 -1을 저장
- 각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 담은 배열 리턴

### 풀이 아이디어
- 각 문자열 별로 최소로 눌러야 하는 횟수를 담을 정수 배열 answer을 targets.length 크기로 초기화
- Map<Character, Integer> map을 HashMap 구현체로 초기화
- 문자열 key가 keymap을 도는 for문 실행
  - 정수 변수 i가 0부터 key.length() 전까지 도는 for문 실행
    - 문자열 c를 key.charAt(i)로 초기화
    - map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), i + 1)) 실행
    - 문자가 이미 저장되어 있으면 기존 입력 횟수를 가져오고, 처음 등장한 문자라면 Integer.MAX_VALUE를 기본값으로 사용
    - 이후 Math.min()으로 기존 입력 횟수와 현재 입력 횟수(i+1) 중 더 작은 값을 저장하여 각 문자의 최소 입력 횟수를 유지
- 정수 변수 i가 0부터 target.length 전까지 도는 for문 실행
  - 누적 횟수를 담을 정수 변수 sum을 0으로 초기화
  - 목표 문자열을 작성할 수 있는 지의 여부를 나타내는 불리언 변수 possible을 true로 초기화
  - 문자 변수 c가 targets[i].toCharArray()를 도는 for문 실행
    - !map.containsKey(c) 조건식 만족 시
      - possible에 false 대입 후 break 실행
    - sum에 map.get(c) 더하기
  - answer[i]에 possible? sum : -1 대입
- answer 리턴