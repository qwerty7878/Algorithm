import sys
from collections import deque

n,k = map(int, sys.stdin.readline().split())
dq = deque(range(1, n+1))
arr = []

while True:
    if len(dq) == 1:
        break

    for i in range(k):
        if (i + 1) != k:
            dq.append(dq.popleft())
        elif (i + 1) == k:
            arr.append(dq.popleft())

arr.append(dq.popleft())
print(f'<{", ".join(map(str, arr))}>')