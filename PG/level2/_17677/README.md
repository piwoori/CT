# [level2] [1차] 뉴스 클러스터링 - 17677

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/17677)

### 분류
- ArrayList

### 문제 요약
- 문자열 str1, str2 매개변수
  - 각 문자열의 길이는 2 이상, 1,000 이하
- 입력으로 들어온 문자열은 두 글자씩 끊어서 다중집합의 원소 만듦
- 영문자로 된 글자 쌍만 유효하고, 기타 공백이나 숫자, 특수 문자가 들어있는 경우는 그 글자 쌍을 버림
- 대문자와 소문자의 차이는 무시
- "자카드 유사도"라는 방법 적용
  - 집합 간의 유사도를 검사하는 여러 방법 중의 하나
  - 두 집합 A, B 사이의 자카드 유사도 J(A, B)는 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의
- 입력으로 들어온 두 문자열의 자카드 유사도 리턴
  - 유사도 값은 0에서 1 사이의 실수이므로, 이를 다루기 쉽도록 65536을 곱한 후에 소수점 아래를 버리고 정수부만 리턴

### 풀이 아이디어
- str1의 부분 집합을 넣을 ArrayList<String> list1 초기화
- str2의 부분 집합을 넣을 ArrayList<String> list2 초기화
- 대소문자 차이를 없애기 위해 str1에 str1.toLowerCase() 대입
- 대소문자 차이를 없애기 위해 str2에 str2.toLowerCase() 대입
- 정수 변수 i가 0부터 str1.length() - 1 전까지 도는 for문 실행
  - 문자열 s를 str1.substring(i, i + 2)로 초기화
  - s.matches("[a-z]{2}") 조건식 만족 시
    - list1.add(s) 실행
- 정수 변수 i가 0부터 str2.length() - 1 전까지 도는 for문 실행 
  - 문자열 s를 str2.substring(i, i + 2)로 초기화
  - s.matches("[a-z]{2}") 조건식 만족 시 
    - list1.add(s) 실행
- 교집합을 나타내는 정수 변수 inter을 0으로 초기화
- 문자열 s가 list1을 도는 for문 실행
  - list2.contains(s) 조건식 만족 시
    - inter++ 실행
    - list2.remove(s) 실행 해 중복 제거
- 합집합을 나타내는 정수 변수 union을 list1.size() + list2.size()로 초기화
- union == 0 조건식 만족 시 65536 리턴
- (int) ((double) inter / union * 6 리턴