import sys
from collections import deque

m,n,h = map(int,sys.stdin.readline().split())
tomato = [[list(map(int,sys.stdin.readline().split())) for _ in range(n)] for _ in range(h)]
visited = [[[False] * m for _ in range(n)] for _ in range(h)]

dx = [-1, 1, 0, 0, 0, 0]
dy = [0, 0, -1, 1, 0, 0]
dz = [0, 0, 0, 0, 1, -1]

queue = deque()
for i in range(h):
    for j in range(n):
        for k in range(m):
            if tomato[i][j][k] == 1:
                queue.append((i, j, k))

def bfs():
    while queue:
        x, y, z = queue.popleft()
        for i in range(6):
            nx = x + dx[i]
            ny = y + dy[i]
            nz = z + dz[i]

            if nx < 0 or nx >= h or ny < 0 or ny >= n or nz < 0 or nz >= m:
                continue

            if tomato[nx][ny][nz] == 0 and visited[nx][ny][nz] == False:
                visited[nx][ny][nz] = True
                tomato[nx][ny][nz] = tomato[x][y][z] + 1
                queue.append((nx, ny, nz))

bfs()

tmax = -1
for i in tomato:
    for j in i:
        for k in j:
            if k == 0:
                print(-1)
                exit(0)
            tmax = max(tmax, max(j))
print(tmax - 1)