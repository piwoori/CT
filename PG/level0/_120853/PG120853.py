def solution(s):
    slist = s.split(" ")
    answer = 0
    for i in range(len(slist)):
        if slist[i] == 'Z':
            answer -= int(slist[i - 1])
        else:
            answer += int(slist[i])
    return answer