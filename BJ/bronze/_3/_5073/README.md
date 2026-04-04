# [bronze 3] 삼각형과 세 변 - 5073

[문제 링크](https://www.acmicpc.net/problem/5073)

### 분류
- 반복문
- 조건문

### 문제 요약
- 각 줄에 삼각형의 세 변의 길이인 1,000을 넘지 않는 양의 정수 3개 입력
- Equilateral :  세 변의 길이가 모두 같은 경우 
- Isosceles : 두 변의 길이만 같은 경우 
- Scalene : 세 변의 길이가 모두 다른 경우
- Invalid: 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않은 경우
- 위 정의에 따른 결과 출력

### 풀이 아이디어
- while(true)문 이용
- 세 길이를 배열에 저장
- 셋 다 0 이면 break로 while문 종료
- Arrays.sort()로 배열 오름차순으로 정렬
- arr[2] >= arr[0] + arr[1]: Invalid
- arr[0] == arr[1] && arr[1] == arr[2]: Equilateral
- arr[0] != arr[1] && arr[1] != arr[2]: Scalene
- 그 외: Isosceles