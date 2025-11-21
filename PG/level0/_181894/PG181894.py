def solution(arr):
    num = []
    for i in range(len(arr)) :
        if arr[i] == 2: num.append(i)
    if num == []:
        return [-1]
    else:
        return arr[num[0]:num[-1] + 1]