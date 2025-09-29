import sys
from collections import deque

n = int(sys.stdin.readline())
arr = [[] for i in range(n + 1)]
visited = [0] * (n + 1)

for i in range(n - 1):
    a,b = map(int, sys.stdin.readline().split())
    arr[a].append(b)
    arr[b].append(a)


def bfs(start):
    queue = deque([start])
    
    while queue:
        x = queue.popleft()
        for i in arr[x]:
            if visited[i] == 0:
                visited[i] = x
                queue.append(i)

bfs(1)
ans = visited[2:]
for i in ans:
    print(i)