import sys
from collections import deque

n,m,v = map(int, sys.stdin.readline().split())
graph = [[0] * (n + 1) for _ in range(n+1)]

for i in range(m):
    a,b = map(int, sys.stdin.readline().split())
    graph[a][b] = graph[b][a] = 1

isVisited1 = [False for _ in range(n+1)]
isVisited2 = [False for _ in range(n+1)]

def dfs(v):
    isVisited1[v] = True
    print(v, end=' ')
    for i in range(1, n+1):
        if graph[v][i] == 1 and not isVisited1[i]:
            dfs(i)

def bfs(v):
    queue = deque([v])
    isVisited2[v] = True
    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in range(1, n+1):
            if graph[v][i] == 1 and not isVisited2[i]:
                queue.append(i)
                isVisited2[i] = True

dfs(v)
print()
bfs(v)