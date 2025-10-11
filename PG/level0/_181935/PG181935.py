def solution(n):
    answer = 0
    
    if (n % 2 == 0):
        for i in range(n + 1):
            if (i % 2 == 0):
                answer += i ** 2
            
    if (n % 2 == 1):
        for j in range(n + 1):
            if (j % 2 == 1):
                answer += j
                
    return answer