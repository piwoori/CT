def solution(n_str):
    for s, e in enumerate(n_str):
        if e != "0":
            return n_str[s:]

def solution(n_str):
    return n_str.lstrip("0")