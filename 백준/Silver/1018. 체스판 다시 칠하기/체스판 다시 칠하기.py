import sys

n,m = map(int,sys.stdin.readline().split())
board = []

for _ in range(n):
      board.append(list(sys.stdin.readline()))

ans = sys.maxsize
for x in range(n - 7):
      for y in range(m - 7):
            bcnt = 0
            wcnt = 0
            for i in range(x,x + 8):
                  for j in range(y,y + 8):
                        if (i + j) % 2 == 0:
                              if board[i][j] != 'B':
                                    bcnt += 1
                              else:
                                    wcnt += 1
                        else:
                              if board[i][j] != 'W':
                                    bcnt += 1
                              else:
                                    wcnt += 1
            ans = min(ans, bcnt, wcnt)
print(ans)