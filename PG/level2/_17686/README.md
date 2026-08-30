# [level2] [3차] 파일명 정렬 - 17686

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/17686)

### 분류
- Arrays

### 문제 요약
- 소스 파일 저장소에 저장된 파일명이 담긴 배열 files 메개변수
  - files는 1000 개 이하의 파일명을 포함하는 문자열 배열
  - 각 파일명은 100 글자 이하 길이로, 영문 대소문자, 숫자, 공백(" "), 마침표("."), 빼기 부호("-")만으로 구성
  - 파일명은 영문자로 시작하며, 숫자를 하나 이상 포함
  - 중복된 파일명은 없으나, 대소문자나 숫자 앞부분의 0 차이가 있는 경우는 함께 주어질 수 있음
    - muzi1.txt, MUZI1.txt, muzi001.txt, muzi1.TXT는 함께 입력으로 주어질 수 있음
- 단순한 문자 코드 순이 아닌, 파일명에 포함된 숫자를 반영한 정렬 기능을 저장소 관리 프로그램에 구현
- 파일명은 크게 HEAD, NUMBER, TAIL의 세 부분으로 구성
  - HEAD는 숫자가 아닌 문자로 이루어져 있으며, 최소한 한 글자 이상
  - NUMBER는 한 글자에서 최대 다섯 글자 사이의 연속된 숫자로 이루어져 있으며, 앞쪽에 0이 올 수 있음
    - 0부터 99999 사이의 숫자로, 00000이나 0101 등도 가능
  - TAIL은 그 나머지 부분으로, 여기에는 숫자가 다시 나타날 수도 있으며, 아무 글자도 없을 수 있음
- 파일명을 세 부분으로 나눈 후, 다음 기준에 따라 파일명을 정렬
  - 파일명은 우선 HEAD 부분을 기준으로 사전 순으로 정렬
    - 문자열 비교 시 대소문자 구분을 하지 않음
    - MUZI와 muzi, MuZi는 정렬 시에 같은 순서로 취급
  - 파일명의 HEAD 부분이 대소문자 차이 외에는 같을 경우, NUMBER의 숫자 순으로 정렬
    - 9 < 10 < 0011 < 012 < 13 < 014 순으로 정렬
    - 숫자 앞의 0은 무시되며, 012와 12는 정렬 시에 같은 같은 값으로 처리
  - 두 파일의 HEAD 부분과, NUMBER의 숫자도 같을 경우, 원래 입력에 주어진 순서를 유지
    - MUZI01.zip과 muzi1.png가 입력으로 들어오면, 정렬 후에도 입력 시 주어진 두 파일의 순서가 바뀌어서는 안 됨
- 위 기준에 따라 정렬된 배열 리턴

### 풀이 아이디어
- 문자열 배열을 반환하고 문자열 배열 files를 매개변수로 하는 solution 메소드 정의
  - files, (a, b)를 다음의 기준에 따라 Arrays.sort() 실행
    - 문자열 부분만을 나타내는 문자열 변수 headA를 getHead(a)로 초기화
    - 문자열 부분만을 나타내는 문자열 변수 headB를 getHead(b)로 초기화
    - 정수 변수 headCompare를 headA.compareToIgnoreCase(headB)로 초기화
      - compareToIgnoreCase() 이용해 대소문자 상관없이 비교
      - 두 대상이 같을 때 값이 0이 됨
    - headCompare != 0 조건식 만족 시
      - headCompare 리턴
    - 정수 부분만을 나타내는 정수 변수 numberA를 getNumber(a)로 초기화
    - 정수 부분만을 나타내는 정수 변수 numberB를 getNumber(b)로 초기화
    - numberA - numberB 리턴
  - files 리턴
- 문자열을 반환하고 문자열 변수 file을 매개변수로 하는 getHead 메소드 정의
  - 문자의 인덱스를 나타내는 정수 변수 i를 0으로 초기화
  - i < file.length() && !Character.isDigit(file.charAt(i)) 조건식을 만족하는 while문 실행
    - i++ 실행
  - file.substring(0, i) 리턴
- 정수를 반환하고 문자열 변수 file을 매개변수로 하는 getNumber 메소드 정의
  - 문자의 인덱스를 나타내는 정수 변수 i를 0으로 초기화
  - i < file.length() && !Character.isDigit(file.charAt(i)) 조건식을 만족하는 while문 실행
    - i++ 실행
  - 추출한 문자열의 시작 인덱스를 나타내는 정수 변수 start를 i로 초기화
  - i < file.length() && Character.isDigit(file.charAt(i)) && i - start < 5 조건식을 만족하는 while문 실행
    - 정수 부분이 5자리 이하이기에 조건식 추가
    - i++ 실행
  - Integer.parseInt(file.substring(start, i)) 리턴