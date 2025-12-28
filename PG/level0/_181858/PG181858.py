def solution(arr, k):
    answer = []
    for i in arr:
        if i not in answer and len(answer) <= k:
            answer.append(i)
        if len(answer) == k:
            break

    if len(answer) < k:
        answer.extend([-1] * (k - len(answer)))

    return answer