from collections import deque

n,k = map(int,input().split())
arr = [0] * 100001

def bfs(n):
    queue = deque()
    queue.append(n)

    while queue:
        x = queue.popleft()

        if x == k:
            return arr[x]

        for i in (x - 1, x + 1, 2 * x):
            if 0 <= i < 100001 and not arr[i]:
                arr[i] = arr[x] + 1
                queue.append(i)

print(bfs(n))