import sys

input = sys.stdin.readline

n, m  = map(int, input().split())
board = []

for _ in range(n):
    line = input().strip()
    board.append(line)

# print(board)

count = 10000
for i in range(n - 7):
    for j in range(m - 7):
        Bcount = 0
        Wcount = 0
        for x in range(i, i + 8):
            for y in range(j, j + 8):
        #         print(board[x][y], end='')
        #     print()
        # print()
                if (x + y) % 2 == 0:
                    if board[x][y] != 'B':
                        Bcount += 1
                    else:
                        Wcount += 1
                else:
                    if board[x][y] != 'W':
                        Bcount += 1
                    else:
                        Wcount += 1
        count = min(count, min(Bcount, Wcount))
print(count)