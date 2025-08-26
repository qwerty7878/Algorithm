import sys

c = int(sys.stdin.readline())
n = int(sys.stdin.readline())

graph = [[0] * (c + 1) for _ in range(c + 1)]
isVisited = [False] * (c + 1)

for i in range(n):
    a,b = map(int, sys.stdin.readline().split())
    graph[a][b] = 1
    graph[b][a] = 1

cnt = 0

def dfs(v):
    global cnt
    isVisited[v] = True
    for i in range(1, c + 1):
        if not isVisited[i] and graph[v][i] == 1:
            cnt += 1
            dfs(i)

dfs(1)
print(cnt)
