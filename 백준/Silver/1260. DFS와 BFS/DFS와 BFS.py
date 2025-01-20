from collections import deque

n,m,v = map(int,input().split())
arr = [[0] * (n + 1) for i in range(n + 1)]

for _ in range(m):
    a,b = map(int,input().split())
    arr[a][b] = 1
    arr[b][a] = 1

visited_dfs = [False] * (n + 1)
visited_bfs = [False] * (n + 1)

def dfs(v):
    visited_dfs[v] = True
    print(v, end=' ')

    for i in range(1, n + 1):
        if not visited_dfs[i] and arr[v][i] == 1:
            dfs(i)

def bfs(v):
    queue = deque([v])
    visited_bfs[v] = True

    while queue:
        v = queue.popleft()
        print(v, end=' ')

        for i in range(1, n + 1):
            if not visited_bfs[i] and arr[v][i] == 1:
                queue.append(i)
                visited_bfs[i] = True

dfs(v)
print()
bfs(v)