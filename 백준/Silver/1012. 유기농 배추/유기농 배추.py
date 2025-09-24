import sys
from collections import deque

t = int(sys.stdin.readline())

dx = [-1,1,0,0]
dy = [0,0,-1,1]

def bfs(start, end):
    queue = deque()
    queue.append((start, end))

    while queue:
        start, end = queue.popleft()
        for i in range(4):
            nx = start + dx[i]
            ny = end + dy[i]

            if nx < 0 or ny < 0 or nx >= n  or ny >= m:
                continue

            if arr[nx][ny] == 1:
                queue.append((nx, ny))
                arr[nx][ny] = 0

for _ in range(t):
    m,n,k = map(int, sys.stdin.readline().split())
    arr = [[0] * m for _ in range(n)]

    for _ in range(k):
        a,b = map(int, sys.stdin.readline().split())
        arr[b][a] = 1

    bug = 0
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 1:
                bfs(i, j)
                bug += 1

    print(bug)