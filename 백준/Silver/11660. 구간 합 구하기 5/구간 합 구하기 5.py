import sys

n,m = map(int, sys.stdin.readline().split())

arr = [list(map(int,sys.stdin.readline().split())) for _ in range(n)]
s = [[0] * (n + 1) for _ in range(n + 1)]

for i in range(1, n + 1):
    for j in range(1, n + 1):
        s[i][j] = s[i][j - 1] + s[i - 1][j] - s[i - 1][j - 1] + arr[i - 1][j - 1]

for _ in range(m):
    x1,y1,x2,y2 = map(int,sys.stdin.readline().split())

    ans = s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1]
    print(ans)