import sys
from collections import deque

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())
c = list(map(int, sys.stdin.readline().split()))

qs = deque()
for i in range(n):
    #   큐라면 나가는 수랑 들어오는 수 다름
    if a[i] == 0:
        qs.append(b[i])

    #   스택이라면 나가고 들어오는 수 똑같아서 무시
    continue

for i in range(m):
    #   큐에 대한 조건만 들어있음
    qs.appendleft(c[i])
    print(qs.pop(), end=' ')