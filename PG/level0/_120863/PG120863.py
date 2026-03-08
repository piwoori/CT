def solution(polynomial):
    x_sum = 0
    num_sum = 0

    for term in polynomial.split(" + "):
        if 'x' in term:
            if term == 'x':
                x_sum += 1
            else:
                x_sum += int(term[:-1])
        else:
            num_sum += int(term)

    answer = ""

    if x_sum:
        if x_sum == 1:
            answer += "x"
        else:
            answer += str(x_sum) + "x"

    if num_sum:
        if answer:
            answer += " + "
        answer += str(num_sum)

    return answer