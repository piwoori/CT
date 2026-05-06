# [level2] 최솟값 만들기 - 12941

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12941)

### 분류
- 배열

### 문제 요약
- 배열의 길이 N 입력
- 자연수로 이루어진 길이가 깉은 배열 A, B 입력
- 배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱하기를 배열의 길이만큼 반복하여 두 수를 곱한 값을 누적하여 더함
- 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없음
- 최종적으로 누적된 최솟값 리턴

### 풀이 아이디어
- BufferedReader 이용해 N 입력 받은 뒤 N 크기의 배열 두개 초기화
- 반복문과 StringTokenizer으로 원소 입력 받아 대입
- Arrays.sort() 이용해 두 배열 오름차순 정렬
- 정수 변수 answer 초기화
- 0부터 N까지 도는 반복문 실행
- answer에 A[i] * B[N - i - 1] 대입 A는 앞에서부터 B는 뒤에서부터
- answer 출력