def solution(arr):
    stk = []
    i = 0
    while (i <len(arr)):
        if not stk:
            stk.append(arr[i])
            i += 1
        else:
            if (stk[-1] < arr[i]):
                stk.append(arr[i])
                i += 1
            else:
                stk.pop()
            
    return stk

# 지피티 버전
def solution(arr):
    stk = []
    for a in arr:
        while stk and stk[-1] >= a:
            stk.pop()
        stk.append(a)
    return stk