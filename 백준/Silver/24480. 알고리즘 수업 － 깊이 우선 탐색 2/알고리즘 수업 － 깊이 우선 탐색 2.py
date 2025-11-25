import sys
sys.setrecursionlimit(10**6)

def dfs(r):
    global count
    visited[r] = count
    count += 1

    for num in arr[r]:
        if visited[num] == 0:
            dfs(num)

n, m, r = map(int, sys.stdin.readline().strip().split())
arr = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)
count = 1

for _ in range(m):
    u, v = map(int, sys.stdin.readline().strip().split())
    arr[u].append(v)
    arr[v].append(u)

for i in range(1, n + 1):
    arr[i].sort(reverse=True)

dfs(r)

for i in range(1, n + 1):
    print(visited[i])