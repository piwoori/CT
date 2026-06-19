# [level1] 옹알이 (2) - 133499

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/133499)

### 분류
- 문자열

### 문제 요약
- 조카가 발음할 수 있는 문자열을 담은 문자열 배열 babbling 매개변수
  - 1 ≤ babbling의 길이 ≤ 100
  - 1 ≤ babbling[i]의 길이 ≤ 30
  - 문자열은 알파벳 소문자로만 이루어짐
- 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워 함
- 조카가 발음할 수 있는 단어의 개수 리턴

### 풀이 아이디어
- 발음할 수 있는 개수를 나타내는 정수 변수 answer을 0으로 초기화
- 문자열 변수 word가 babbling을 도는 for문 실행
  - word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama") 조건식 만족 시
    - continue 실행해 연속되는 문자열 거르기
  - word에 word.replace("aya", " ") 대입해 해당 문자열 공백으로 바꾸기
  - word에 word.replace("ye", " ") 대입해 해당 문자열 공백으로 바꾸기
  - word에 word.replace("woo", " ") 대입해 해당 문자열 공백으로 바꾸기
  - word에 word.replace("ma", " ") 대입해 해당 문자열 공백으로 바꾸기
  - word.trim().isEmpty()의 조건식 만족 시 
    - answer++ 실행해 공백이면 말할 수 있는 단어라고 판단
- answer 리턴