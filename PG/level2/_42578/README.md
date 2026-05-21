# [level2] 의상 - 42578

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42578)

### 분류
- HashMap

### 문제 요약
- 코니가 가진 의상들이 담긴 2차원 배열 clothes 매개변수
  - clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있음
  - 코니가 가진 의상의 수는 1개 이상 30개 이하
  - 같은 이름을 가진 의상은 존재하지 않음
  - clothes의 모든 원소는 문자열로 이루어져 있음
  - 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있음
- 코니는 매일 다른 옷을 조합하여 입음
- 서로 다른 옷의 조합의 수 리턴

### 풀이 아이디어
- HashMap<String, Integer> map 초기화
- String 배열 cloth가 clothes를 도는 for문 실행
  - 문자열 type를 cloth[1]로 초기화
  - map.put(type, map.getOrDefault(type, 0) + 1) 실행
    - 값이 없으면 1 있으면 기존 값 + 1
- 정수 변수 answer를 1로 초기화
- 정수 변수 count가 map.values()를 도는 for문 실행
  - answer *= (count + 1) 실행
    - 갯수 count + 안 입기 1
- answer - 1 리턴
  - 아무 것도 안 입는 경우 제외