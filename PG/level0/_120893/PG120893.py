def solution(my_string):
    answer = ""
    for i in my_string:
        if i.isupper() :
            answer += i.lower()
        else:
            answer += i.upper()
    return answer

def solution(my_string):
    return my_string.swapcase()

def solution(my_string):
    return ''.join([x.lower() if x.isupper() else x.upper() for x in my_string])