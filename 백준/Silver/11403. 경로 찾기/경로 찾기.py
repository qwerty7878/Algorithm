import sys
sys.setrecursionlimit(10 ** 6)

n = int(sys.stdin.readline())
board = [] * 101

for _ in range(n):
    board.append(list(map(int, sys.stdin.readline().split())))

for k in range(n):
    for i in range(n):
        for j in range(n):
            if board[i][k] == 1 and board[k][j] == 1:
                board[i][j] = 1

for i in board:
    print(' '.join(map(str, i)))