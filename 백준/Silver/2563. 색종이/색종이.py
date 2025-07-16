import sys

t = int(sys.stdin.readline())
paper = [[0] * 100 for i in range(100)]

for i in range(t):
    x,y = map(int, sys.stdin.readline().split())

    for a in range(x, x + 10):
        for b in range(y, y + 10):
            paper[a][b] = 1

ans = 0
for i in range(100):
    ans += paper[i].count(1)
print(ans)