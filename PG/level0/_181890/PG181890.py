def solution(str_list):
    answer = []
    for i in range(len(str_list)):
        if str_list[i] == "l":
            answer = str_list[:i]
            break
        elif str_list[i] == "r":
            answer = str_list[i + 1:]
            break
    return answer

# 혹은
def solution1(str_list):
    for i in range(len(str_list)):
        if str_list[i] == "l":
            return str_list[:i]
        elif str_list[i] == "r":
            return str_list[i + 1:]