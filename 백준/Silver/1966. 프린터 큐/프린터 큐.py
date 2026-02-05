import sys
from collections import deque
input = sys.stdin.readline

t = int(input().strip())
for _ in range(t):
    n, m = map(int, input().split())
    queue = deque(list(map(int, input().split())))
    # print(queue)

    count = 0
    while queue:
        maxNum = max(queue)
        # print(maxNum)
        target = queue.popleft()
        m -= 1

        if maxNum == target:
            count += 1
            if m < 0:
                print(count)
                break
        else:
            queue.append(target)
            if m < 0:
                m = len(queue) - 1