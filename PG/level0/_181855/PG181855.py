def solution(strArr):
    list = [0] * 31
    for i in strArr:
        list[len(i)] += 1
    return max(list)