def solution(id_pw, db):
    for i, p in db:
        if i == id_pw[0]:
            if p == id_pw[1]:
                return "login"
            else:
                return "wrong pw"
    return "fail"