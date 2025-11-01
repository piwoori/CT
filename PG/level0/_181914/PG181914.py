def solution(number):
    answer = 0
    num_string = str(number)
    for i in range(len(num_string)):
        answer += int(num_string[i])
    return answer % 9