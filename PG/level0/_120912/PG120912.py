def solution(array):
    answer = 0
    for i in array:
        word = str(i)
        for j in word:
            if j == '7':
                answer += 1
    return answer

# 수정 버전
def solution(array):
    return str(array).count('7')