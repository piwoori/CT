# [level1] [PCCE 기출문제] 1번 /  동영상 재생기 - 340213

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340213)

### 분류
- 문자열

### 문제 요약
- 동영상의 길이를 나타내는 문자열 video_len, 기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos, 오프닝 시작 시각을 나타내는 문자열 op_start, 오프닝이 끝나는 시각을 나타내는 문자열 op_end, 사용자의 입력을 나타내는 1차원 문자열 배열 commands 매개변수
  - video_len의 길이 = pos의 길이 = op_start의 길이 = op_end의 길이 = 5
    - video_len, pos, op_start, op_end는 "mm:ss" 형식으로 mm분 ss초를 나타넴
    - 0 ≤ mm ≤ 59
    - 0 ≤ ss ≤ 59
    - 분, 초가 한 자리일 경우 0을 붙여 두 자리로 나타냄
    - 비디오의 현재 위치 혹은 오프닝이 끝나는 시각이 동영상의 범위 밖인 경우는 주어지지 않음
    - 오프닝이 시작하는 시각은 항상 오프닝이 끝나는 시각보다 전임
  - 1 ≤ commands의 길이 ≤ 100
    - commands의 원소는 "prev" 혹은 "next"
    - "prev"는 10초 전으로 이동하는 명령
    - "next"는 10초 후로 이동하는 명령
- 당신의 동영상 재생기는 10초 전으로 이동, 10초 후로 이동, 오프닝 건너뛰기 3가지 기능을 지원
- 각 기능이 수행하는 작업은 다음과 같음
  - 0초 전으로 이동: 
    - 사용자가 "prev" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동
    - 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동
    - 영상의 처음 위치는 0분 0초
  - 10초 후로 이동: 
    - 사용자가 "next" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 후로 이동
    - 동영상의 남은 시간이 10초 미만일 경우 영상의 마지막 위치로 이동
    - 영상의 마지막 위치는 동영상의 길이와 같음
  - 오프닝 건너뛰기: 
    - 현재 재생 위치가 오프닝 구간(op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동
- 사용자의 입력이 모두 끝난 후 동영상의 위치를 "mm:ss" 형식으로 리턴

### 풀이 아이디어
- 문자열을 반환하고 문자열 video_len, 문자열 pos, 문자열 op_start, 문자열 op_end, 문자열 배열 commands 매개변수로 하는 solution 메소드 정의
  - 비디오의 시간을 나타내는 정수 변수 video를 toSecond(video_len)로 초기화
  - 현재 시간을 정수 변수 current를 toSecond(pos)로 초기화
  - 오프닝 시작 시간을 나타내는 정수 변수 opStart를 toSecond(op_start)로 초기화
  - 오프닝 끝 시간을 나타내는 정수 변수 opEnd를 toSecond(op_end)로 초기화
  - current에 skipOpening(current, opStart, opEnd) 대입해 오프닝 스킵 적용
  - 문자열 변수 command가 배열 commands를 도는 for문 실행
    - command.equals("prev") 조건식 만족 시
      - current에 Math.max(0, current - 10) 대입
    - 그 외일 때는
      - current에 Math.min(video, current + 10) 대입
    - current에 skipOpening(current, opStart, opEnd) 대입해 다시 오프닝 스킵 적용
  - toTime(current) 리턴
- 정수를 반환하고 문자열 time을 매개변수로 하는 toSecond 메소드 정의
  - 문자열 배열 parts를 time.split(":")로 초기화
  - 분을 나타내는 정수 변수 minute를 Integer.parseInt(parts[0])로 초기화
  - 초를 나타내는 정수 변수 second를 Integer.parseInt(parts[1])로 초기화
  - minute * 60 + second 리턴
- 정수를 반환하고 문자열 current, opStart, opEnd를 매개변수로 하는 skipOpening 메소드 정의
  - current >= opStart && current <= opEnd 조건식 만족 시
    - opEnd 리턴
  - current 리턴
- 문자열을 반환하고 정수 time를 매개변수로 하는 toTime 메소드 정의
  - 분을 나타내는 정수 변수 minute을 time / 60으로 초기화
  - 초를 나타내는 정수 변수 second를 time % 60으로 초기화
  - String.format("%02d:%02d", minute, second) 리턴
    - 정수를 두 자리로 표시하고 한 자리면 앞에 0을 붙임