# [level2] 최댓값과 최솟값 - 12939

[문제 링크](https://www.acmicpc.net/problem/12939)

### 분류
- 문자열
- 배열

### 문제 요약
- 문자열 s 매개변수(둘 이상의 정수가 공백으로 구분되어 있음)
- str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열 리턴

### 풀이 아이디어
- 문자열 배열 slist와 정수 배열 ilist 초기화
- split(" ") 이용해 문자열을 나눠 slist에 저장
- 반복문 이용해 ilist에 원소를 정수로 변환해 저장
- Arrays.sort() 이용해 정렬
- ilist[0] + " " + ilist[slist.length - 1] 리턴