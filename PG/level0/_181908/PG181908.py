def solution(my_string, is_suffix):
    suffix = []
    answer = 0
    for i in range(len(my_string)):
        suffix.append(my_string[i:])
    for i in suffix:
        if(i == is_suffix):
            answer += 1
    return answer