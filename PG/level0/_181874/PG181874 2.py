def solution(myString):
    return "".join(i.upper() if i.lower() == 'a' else i.lower() for i in myString)

# 수정 버전
def solution(myString):
    return myString.lower().replace('a', 'A')