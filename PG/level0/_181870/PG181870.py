def solution(strArr):
    answer = []
    for i in strArr:
        if i.rfind("ad") < 0:
            answer.append(i)
    return answer


def solution(strArr):
    return [word for word in strArr if 'ad' not in word]