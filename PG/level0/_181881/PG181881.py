def solution(arr):
    idx = 0
    prev = arr

    while True:
        next = []
        for i in prev:
            if i >= 50 and i % 2 == 0:
                next.append(i / 2)
            elif i < 50 and i % 2 == 1:
                next.append(i * 2 + 1)
            else:
                next.append(i)

        if(prev == next):
            break
        else:
            idx += 1

        prev = next
    return idx