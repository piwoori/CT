def solution(intStrs, k, s, l):
    answer = []
    for i in intStrs:
        num = int(i[s:s+l])
        if(int(i[s:s+l]) > k):
            answer.append(num)
    return answer