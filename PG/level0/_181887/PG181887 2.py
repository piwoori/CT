def solution(num_list):
    odd = 0
    even = 0
    for i in range(0,len(num_list),2):
        odd += num_list[i]
    for i in range(1,len(num_list),2):
        even += num_list[i]
    return max(odd, even)

# 더 빠른 버전
def solution(num_list):
    return max(sum(num_list[::2]), sum(num_list[1::2]))