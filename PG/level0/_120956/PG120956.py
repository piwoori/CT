def solution(babbling):
    word = ["aya", "ye", "woo", "ma"]
    count = 0

    for i in babbling:
        for j in word:
            if j in i:
                i = i.replace(j, "1")
        if i.isdigit():
            count += 1
    return count