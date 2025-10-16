def solution(num_list):
    sum1 = 0
    mul = 1
    for i in num_list:
        sum1 += i
        mul *= i
    
    if (sum1 ** 2 > mul): return 1
    else: return 0