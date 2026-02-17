def solution(i, j, k):
    cnt = 0
    for t in range(i, j + 1):
        cnt += str(t).count(str(k))
    return cnt