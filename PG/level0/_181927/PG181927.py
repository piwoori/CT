def solution(num_list):
    
    last = 0
    if (num_list[-1] > num_list[-2]):
        last = num_list[-1] - num_list[-2]
    elif (num_list[-1] <= num_list[-2]):
        last = num_list[-1] * 2
     
    num_list.append(last)
    return num_list