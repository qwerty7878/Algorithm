import sys
from collections import deque

n = int(sys.stdin.readline())
queue = deque()

for i in range(n):
    queue.append(i + 1)

i = 1
while True:
    if len(queue) == 1:
        break

    if i % 2 != 0:
        queue.popleft()
    elif i % 2 == 0:
        queue.append(queue.popleft())

    i += 1
print(queue.pop())