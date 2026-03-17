def solution(n):
    answer = 0
    for i in range(4, n + 1):
        check = False
        for j in range(2, int(i ** 0.5) + 1):
            if i % j == 0:
                check = True
        if check:
            answer += 1
    return answer