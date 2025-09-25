import sys

n = int(sys.stdin.readline())
board = []

def div(x, y, n):
    check = board[x][y]
    for i in range(x,x + n):
        for j in range(y,y + n):
            if check != board[i][j]:
                check = -1
                break

    if check == -1:
        print('(', end='')
        div(x, y, n // 2)
        div(x, y + n // 2, n // 2)
        div(x + n // 2, y, n // 2)
        div(x + n // 2, y + n // 2, n // 2)
        print(')', end='')

    elif check == 0:
        print(0, end='')
    else:
        print(1, end='')

for i in range(n):
    board.append(list(map(int, sys.stdin.readline().strip())))

div(0, 0, n)