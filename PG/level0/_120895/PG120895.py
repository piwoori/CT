def solution(my_string, num1, num2):
    slist = list(my_string)
    slist[num1], slist[num2] = slist[num2], slist[num1]
    return "".join(slist)