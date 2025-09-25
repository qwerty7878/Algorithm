import sys

n = int(sys.stdin.readline())
paper = []

def div(x, y, n):
    global white, blue
    color = paper[x][y]
    for i in range(x,x + n):
        for j in range(y,y + n):
            if color != paper[i][j]:
                div(x, y, n // 2)
                div(x + n // 2, y, n // 2)
                div(x, y + n // 2, n // 2)
                div(x + n // 2, y + n // 2, n // 2)
                return

    if color == 0:
        white += 1
    else:
        blue += 1

white = 0
blue = 0
for i in range(n):
    paper.append(list(map(int, sys.stdin.readline().split())))

div(0, 0, n)
print(white)
print(blue)