import sys

n = int(sys.stdin.readline())
tower = list(map(int, sys.stdin.readline().split()))

ans = [0] * n
stack = []

for idx in range(n):
    while stack:
        if stack[-1][1] >= tower[idx]:
            ans[idx] = stack[-1][0] + 1
            break
        else:
            stack.pop()
    stack.append((idx, tower[idx]))
print(*ans)