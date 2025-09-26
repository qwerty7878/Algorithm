from collections import deque

n,m = map(int,input().split())
board = []
visited = [[-1] * m for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for _ in range(n):
    board.append(list(map(int,input().split())))

def bfs(i, j):
    queue = deque([(i, j)])
    visited[i][j] = 0

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m:
                if visited[nx][ny] == -1 and board[nx][ny] == 1:
                    visited[nx][ny] = visited[x][y] + 1
                    queue.append((nx, ny))

for i in range(n):
    for j in range(m):
        if board[i][j] == 2:
            bfs(i, j)
        elif board[i][j] == 0:
            visited[i][j] = 0

for i in visited:
    print(' '.join(map(str, i)))