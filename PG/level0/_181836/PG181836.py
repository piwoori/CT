def solution(picture, k):
    result = []

    for i in picture:
        word = ""
        for j in range(len(i)):
            for m in range(k):
                word += i[j]
        for j in range(k):
            result.append(word)

    return result

def solution(picture, k):
    answer = []
    for i in range(len(picture)):
        for _ in range(k):
            answer.append(picture[i].replace('.', '.' * k).replace('x', 'x' * k))
    return answer