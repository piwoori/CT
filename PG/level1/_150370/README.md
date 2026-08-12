# [level1] 개인정보 수집 유효기간 - 150370

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/150370)

### 분류
- ArrayList
- HashMap

### 문제 요약
- 오늘 날짜를 의미하는 문자열 today, 약관의 유효기간을 담은 1차원 문자열 배열 terms와 수집된 개인정보의 정보를 담은 1차원 문자열 배열 privacies 매개변수
    - today는 "YYYY.MM.DD" 형태로 오늘 날짜를 나타냄
    - 1 ≤ terms의 길이 ≤ 20
        - terms의 원소는 "약관 종류 유효기간" 형태의 약관 종류와 유효기간을 공백 하나로 구분한 문자열
        - 약관 종류는 A~Z중 알파벳 대문자 하나이며, terms 배열에서 약관 종류는 중복되지 않음
        - 유효기간은 개인정보를 보관할 수 있는 달 수를 나타내는 정수이며, 1 이상 100 이하
    - 1 ≤ privacies의 길이 ≤ 100
        - privacies[i]는 i+1번 개인정보의 수집 일자와 약관 종류를 나타냄
        - privacies의 원소는 "날짜 약관 종류" 형태의 날짜와 약관 종류를 공백 하나로 구분한 문자열
        - 날짜는 "YYYY.MM.DD" 형태의 개인정보가 수집된 날짜를 나타내며, today 이전의 날짜만 주어짐
        - privacies의 약관 종류는 항상 terms에 나타난 약관 종류만 주어짐
    - today와 privacies에 등장하는 날짜의 YYYY는 연도, MM은 월, DD는 일을 나타내며 점(.) 하나로 구분되어 있음
        - 2000 ≤ YYYY ≤ 2022
        - 1 ≤ MM ≤ 12
        - MM이 한 자릿수인 경우 앞에 0이 붙음
        - 1 ≤ DD ≤ 28
        - DD가 한 자릿수인 경우 앞에 0이 붙음
    - 파기해야 할 개인정보가 하나 이상 존재하는 입력만 주어짐
- 고객의 약관 동의를 얻어서 수집된 1~n번으로 분류되는 개인정보 n개가 있음
- 약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있음
- 수집된 개인정보는 유효기간 전까지만 보관 가능하며, 유효기간이 지났다면 반드시 파기
- 모든 달은 28일까지 있다고 가정
- 파기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열 리턴

### 풀이 아이디어
- 정수 배열을 반환하고 문자열 변수 today, 문자열 배열 terms, 문자열 배열 privacie을 매개변수로 하는 solution 메소드 정의
    - 약관 별 유효기간을 나타내는 Map<String, Integer> map을 HashMap 구현체로 초기화
    - 문자열 term이 terms를 도는 for문 실행
        - 문자열 배열 split를 term.split(" ")로 초기화해 공백 기준으로 배열에 저장
        - 문자열 변수 type을 split[0]으로 초기화
        - 정수 변수 month를  Integer.parseInt(split[1])로 초기화
        - map.put(type, month) 실행
    - ArrayList<Integer> answer 초기화
    - 오늘 날짜의 일수를 나타내는 정수 변수 todayDate를 convertDate(today)로 초기화
    - 정수 변수 i가 0부터 privacies.length 전까지 도는 for문 실행
        - 문자열 배열 split를  privacies[i].split(" ")로 초기화
        - 문자열 변수 date를 split[0]로 초기화
        - 문자열 변수 type를 split[1]로 초기화
        - 정수 변수 startDate를 convertDate(date)로 초기화
        - 정수 변수 expireDate를 startDate + map.get(type) * 28으로 초기화
        - expireDate <= todayDate 조건식 만족 시
            - answer.add(i + 1) 실행해 번호 개인정보의 번호 저장
    - answer.stream().mapToInt(Integer::intValue).toArray() 리턴
        - Integer -> Int 변환이기에 stream(), mapToInt() 실행
- 정수를 반환하고 문자열 date를 매개변수로 하는 convertDate 메소드 정의
    - 문자열 배열 split를 date.split("\\.)으로 초기화
        - \\ 이용해 온전한 . 사용할 수 있게 함
    - 정수 변수 year을 Integer.parseInt(split[0])으로 초기화
    - 정수 변수 month를 Integer.parseInt(split[1])으로 초기화
    - 정수 변수 day를 Integer.parseInt(split[2])으로 초기화
    - year * 12 * 28 + month * 28 + day 리턴
