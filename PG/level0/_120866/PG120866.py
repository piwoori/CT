def solution(board):
    n = len(board)
    answer = 0

    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                for nx in range(max(0, i - 1), min(n, i + 2)):
                    for ny in range(max(0, j - 1), min(n, j + 2)):
                        if board[nx][ny] != 1:
                            board[nx][ny] = -1

    for line in board:
        answer += line.count(0)

    return answer