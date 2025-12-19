def solution(myString):
    answer = [i for i in myString.split('x') if i != '']
    answer.sort()
    return answer

def solution(myString):
    return sorted(ch for ch in myString.split('x') if ch)