import sys
input = sys.stdin.readline

board = [list(map(str, input().split())) for _ in range(5)]
ans = set()

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(x, y, s):
    if len(s) == 6:
        ans.add(s)
        return

    for idx in range(4):
        nx = x + dx[idx]
        ny = y + dy[idx]

        if 0 <= nx < 5 and 0 <= ny < 5:
            dfs(nx, ny, s + board[nx][ny])

for i in range(5):
    for j in range(5):
        dfs(i, j, board[i][j])

print(len(ans))