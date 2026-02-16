def solution(my_string):
    lst = []
    for i in my_string:
        if i not in lst:
            lst.append(i)
    return "".join(lst)