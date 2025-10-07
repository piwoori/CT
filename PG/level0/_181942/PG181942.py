def solution(str1, str2):
    answer = ''
    a = len(str1)
        
    for i in range(a):
        answer += str1[i] + str2[i]
        
    return answer