# [level2] [3차] 압축 - 17684

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/17684)

### 분류
- ArrayList
- HashMap

### 문제 요약
- 영문 대문자로만 이뤄진 문자열 msg 매개변수
  - msg의 길이는 1 글자 이상, 1000 글자 이하
- 어피치는 카카오톡으로 전송되는 메시지를 압축하여 전송 효율을 높이는 업무를 맡게 됨
- 어피치는 여러 압축 알고리즘 중에서 성능이 좋고 구현이 간단한 LZW(Lempel–Ziv–Welch) 압축을 구현
- ZW 압축은 1983년 발표된 알고리즘으로, 이미지 파일 포맷인 GIF 등 다양한 응용에서 사용
  1. 길이가 1인 모든 단어를 포함하도록 사전을 초기화한다
  2. 사전에서 현재 입력과 일치하는 가장 긴 문자열 w를 찾음
  3. w에 해당하는 사전의 색인 번호를 출력하고, 입력에서 w를 제거
  4. 입력에서 처리되지 않은 다음 글자가 남아있다면(c), w+c에 해당하는 단어를 사전에 등록
  5. 단계 2로 돌아감
- 압축 알고리즘이 영문 대문자만 처리
- 사전의 색인 번호는 정수값으로 주어지며, A가 1부터 시작
- 주어진 문자열을 압축한 후의 사전 색인 번호를 배열 리턴

### 풀이 아이디어
- 섹인 번호를 나타내는 List<Integer> answer를 ArrayList 구현체로 초기화
- 각 단어와 해당 색인 번호를 나타내는 Map<String, Integer> map를 HahMap 구현체로 초기화
- 정수 변수  i가 0부터 26 전까지 도는 for문 실행
  - map.put(String.valueOf((char) ('A' + i)), i + 1) 실행해 각 문자를 1부터 26 번호로 저장
- 정수 변수 index를 27로 초기화
- 정수 변수 i를 0으로 초기화
- i < msg.length() 조건식을 만족하는 while문 실행
  - 문자열 w를 String.valueOf(msg.charAt(i))로 초기화
  - 정수 변수 j를 i + 1로 초기화
  - msg.length() && map.containsKey(msg.substring(i, j + 1)) 조건식을 만족하는 while문 실행
    - w에 map.substring(i, j + 1) 대입
    - j++ 실행
  - answer.add(map.get(w)) 실행
  - j < msg.length() 조건식 만족시
    - 문자열 newWord를  msg.substring(i, j + 1)로 초기화
    - map.put(newWord, index++) 실행해 새로운 단어 추가
  - i += w.length() 실행
- answer.stream().mapToInt(Integer::intValue).toArray() 실행