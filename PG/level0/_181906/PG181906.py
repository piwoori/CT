def solution(my_string, is_prefix):
    answer = 0
    list = []
    for i in range(len(my_string)):
        list.append(my_string[:i+1])
    if(is_prefix in list):
        answer = 1
    return answer