def solution(array):
    num = 0
    idx = 0
    answer = []
    for x, i in enumerate(array):
        if i > num:
            num = i
            idx = x
    answer.append(num)
    answer.append(idx)
    return answer

def solution(array):
    val = max(array)
    return [val, array.index(val)]