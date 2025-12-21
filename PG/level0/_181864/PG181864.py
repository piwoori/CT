def solution(myString, pat):
    tmp = ''.join(["B" if i =="A" else "A" for i in myString])
    if pat in tmp:
        return 1
    else:
        return 0