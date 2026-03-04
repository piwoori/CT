def solution(spell, dic):
    for i in dic:
        if "".join(sorted(i)) == "".join(sorted(spell)):
            return 1
    return 2