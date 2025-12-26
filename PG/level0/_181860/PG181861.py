def solution(arr, flag):
    answer = []
    for s, e in enumerate(arr):
        for i in range(e):
            if flag[s]:
                answer += [e, e]
            else:
                answer.pop()

    return answer