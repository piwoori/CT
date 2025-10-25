def solution(l, r):
    answer = []
    
    for i in range(l, r + 1):
        string = str(i)
        check = True
        for j in string:
            if(j != "5" and j != "0"):
                check = False
    
        if(check):
            answer.append(i)
        
    if not answer:
        answer.append(-1)
        
    return answer