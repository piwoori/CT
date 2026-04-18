# [bronze 1] 수 정렬하기 3 - 10989

[문제 링크](https://www.acmicpc.net/problem/10989)

### 분류
- 배열

### 문제 요약
- 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000) 입력
- 둘째 줄부터 N개의 줄에는 10,000보다 작거나 같은 자연수 입력
- 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력

### 풀이 아이디어
- BufferedReader 이용해 N 입력 받기
- N 크기의 배열 list 초기화
- N만큼 도는 반복문과 Integer.parseInt(br.readLine()) 이용해 배열에 원소 하나씩 저장
- Arrays.sort(list)으로 오름차순 정렬
- StringBuilder sb와 N만큼 도는 반복문 이용해 sb.append(list[i]).append("\n") 실행
- 마지막으로 sb 출력