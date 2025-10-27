def solution(n):
    answer = []
    check = True
    answer.append(n)
    while(check):
        if (n % 2 == 0):
            n /= 2
            answer.append(n)
        elif(n % 2 == 1):
            n = 3 * n + 1
            answer.append(n)
            
        if (n == 1):
            check = False
            break
        
    return answer