def solution(n, k):
    answer = []
    for i in range(1, n+1):
        if i % k == 0:
            answer.append(i)
    return answer

# 더 빠른 버전
def solution(n, k):
    return list(range(k, n + 1, k))