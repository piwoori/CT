def solution(my_string, alp):
    return "".join(i.upper() if i == alp else i for i in my_string)

def solution(my_string, alp):
    return my_string.replace(alp, alp.upper())