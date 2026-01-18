def solution(n):

    arr = [[0] * n for _ in range(n)]
    x, y = 0, 0 # 현재 위치
    num = 1
    dir_idx = 0
    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]  # 오른쪽, 아래, 왼쪽, 위

    while num <= (n * n):
        arr[x][y] = num
        num += 1

        next_x = x + directions[dir_idx][0]
        next_y = y + directions[dir_idx][1]

        if (0 <= next_x < n and 0 <= next_y < n and arr[next_x][next_y] == 0):
            x, y = next_x, next_y
        else:
            dir_idx = (dir_idx + 1) % 4
            x += directions[dir_idx][0]
            y += directions[dir_idx][1]

    return arr