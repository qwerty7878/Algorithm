from collections import deque

n = int(input())
board = []

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for i in range(n):
    board.append(list(map(int, input())))

def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    board[x][y] = 0
    cnt = 1

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            if board[nx][ny] == 1:
                board[nx][ny] = 0
                queue.append((nx, ny))
                cnt += 1
    return cnt

ans = []
for i in range(n):
    for j in range(n):
        if board[i][j] == 1:
            ans.append(bfs(i, j))

ans.sort()
print(len(ans))
for i in range(len(ans)):
    print(ans[i])