def solution(num_list):

    if len(num_list) >= 11:
        answer = 0
        return sum(num_list)
    elif len(num_list) <= 10:
        answer = 1
        for i in num_list:
            answer *= i

    return answer


# 더 빠른 버전
from math import prod

def solution(num_list):
    return sum(num_list) if len(num_list)>=11 else prod(num_list)