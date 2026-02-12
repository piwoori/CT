def solution(cipher, code):
    answer = ""
    for idx, i in enumerate(cipher):
        if (idx + 1) % code == 0:
            answer += i
    return answer

def solution(cipher, code):
    return "".join([i for idx, i in enumerate(cipher) if (idx + 1) % code == 0 ])

def solution(cipher, code):

    return cipher[code-1::code]