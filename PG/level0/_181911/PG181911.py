def solution(my_strings, parts):
    answer = ''
    for i, (s, e) in zip(my_strings, parts):
        answer += i[s:e+1]
    return answer