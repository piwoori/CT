def solution(my_string, queries):
    string_list = list(my_string)
    answer = ""
    for s, e in queries:
        end = int((e - s + 1) / 2)
        for i in range(0, end):
            temp = string_list[e - i]
            string_list[e - i] = string_list[s + i]
            string_list[s + i] = temp
    for i in range(len(string_list)):
        answer += string_list[i]
    return answer

# 코드 개선
def solution(my_string, queries):
    ms = my_string
    for s,e in queries:
        ms = ms[:s] + ms[s:e+1][::-1] + ms[e+1:]
    return ms