# [level1] 숫자 문자열과 영단어 - 81301

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/81301)

### 분류
- 문자열

### 문제 요약
- 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s 매개변수
  - 1 ≤ s의 길이 ≤ 50
  - s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않음
  - return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어짐
-  "one4seveneight"와 같이 주어지면 1478 이런 식으로 변환
- s가 의미하는 원래 숫자 리턴

### 풀이 아이디어
- "zero" 부터 "nine"까지의 문자열로 구성된 문자열 배열 list 초기화
- 정수 변수 i가 0부터 list.length 까지 도는 for문 실행
  - s에 s.replase(list[i], String.vauleOf(i)) 대입
    - list[i]를 String.vauleOf(i) 로 대체 
      - 정수를 문자열로 변환
  - Integer.parseInt(s) 리턴
    - 문자열을 정수로 변환