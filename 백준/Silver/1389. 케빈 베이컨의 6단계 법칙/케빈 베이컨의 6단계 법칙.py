from collections import deque

n,m = map(int,input().split())
board = [[] for _ in range(n + 1)]

for i in range(m):
    a,b = map(int,input().split())
    board[a].append(b)
    board[b].append(a)

def bfs(v):
    queue = deque()
    queue.append(v)
    visited[v] = 1

    while queue:
        x = queue.popleft()

        for i in board[x]:
            if visited[i] == 0 and i != x:
                visited[i] = visited[x] + 1
                queue.append(i)

ans = []
for i in range(1, n + 1):
    visited = [0] * (n + 1)
    bfs(i)
    ans.append(sum(visited))

print(ans.index(min(ans)) + 1)