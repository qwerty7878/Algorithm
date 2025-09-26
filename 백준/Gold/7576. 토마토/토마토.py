from collections import deque

m,n = map(int, input().split())
arr = []
visited = [[-1] * m for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for i in range(n):
    arr.append(list(map(int, input().split())))

def bfs(queue):
    while queue:
        x,y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m:
                if arr[nx][ny] == 0 and visited[nx][ny] == -1:
                    queue.append((nx, ny))
                    visited[nx][ny] = visited[x][y] + 1
                    arr[nx][ny] = 1

queue = deque()
for i in range(n):
    for j in range(m):
        if arr[i][j] == 1:
            queue.append((i, j))
            visited[i][j] = 0
bfs(queue)

answer = 0
for i in range(n):
    for j in range(m):
        if arr[i][j] == 0:
            print(-1)
            exit(0)
        answer = max(visited[i][j], answer)

print(answer)