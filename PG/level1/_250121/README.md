# [level1] [PCCE 기출문제] 10번 / 데이터 분석 - 250121

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/250121)

### 분류
- 이차원 배열

### 문제 요약
- 정렬한 데이터들이 담긴 이차원 정수 리스트 data와 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미하는 문자열 ext, 뽑아낼 정보의 기준값을 나타내는 정수 val_ext, 정보를 정렬할 기준이 되는 문자열 sort_by 매개변수
  - 1 ≤ data의 길이 ≤ 500
    - data[i]의 원소는 [코드 번호(code), 제조일(date), 최대 수량(maximum), 현재 수량(remain)] 형태
    - 1 ≤ 코드 번호≤ 100,000
    - 20000101 ≤ 제조일≤ 29991231
    - data[i][1]은 yyyymmdd 형태의 값을 가지며, 올바른 날짜만 주어짐 (yyyy : 연도, mm : 월, dd : 일)
    - 1 ≤ 최대 수량≤ 10,000
    - 1 ≤ 현재 수량≤ 최대 수량
  - ext와 sort_by의 값은 다음 중 한 가지를 가짐
    - "code", "date", "maximum", "remain"
    - 순서대로 코드 번호, 제조일, 최대 수량, 현재 수량을 의미
  - val_ext는 ext에 따라 올바른 범위의 숫자로 주어짐
  - 정렬 기준에 해당하는 값이 서로 같은 경우는 없음
- 데이터는 ["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]으로 구성
- 이 데이터들 중 조건을 만족하는 데이터만 뽑아서 정렬
- data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여 리턴

### 풀이 아이디어
- 주어진 solution 메소드 정의
  - 정수 변수 extIdx를 getIndex(ext)로 초기화
  - 정수 변수 sortIdx를 getIndex(sort_by)로 초기화
  - List<int[]> list를 ArrayList 구현체로 초기화
  - 정수 배열 row가 data를 도는 for문 실행
    - row[extIdx] < val_ext 조건식 만족 시
      - list.add(row) 실행
  - list.sort((a, b) -> a[sortIdx] - b[sortIdx]) 실행해 람다식으로 정렬
  - int[][] answer을 [list.size()][4] 크기로 초기화
  - 정수 변수 i가 0부터 list.size() 전까지 도는 for문 실행
    - answer[i]에 list.get(i) 대입
  - answer 리턴
- 정수를 반환하고 문자열 s를 매개변수로 하는 getIndex 메소드 정의
  - s를 메게변수로 하는 switch문 실행
    - case "code"일 때는 return 0 실행
    - case "date"일 때는 return 1 실행
    - case "maximum"일 때는 return 2 실행
    - case "remain"일 때는 return 3 실행
  - -1 리턴