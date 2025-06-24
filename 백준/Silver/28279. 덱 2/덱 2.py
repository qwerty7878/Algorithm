import sys
from collections import deque

n = int(sys.stdin.readline())
deque = deque()

for i in range(n):
    cmd = sys.stdin.readline().split()

    if cmd[0] == "1":
        deque.appendleft(cmd[1])
    elif cmd[0] == "2":
        deque.append(cmd[1])
    elif cmd[0] == "3":
        if len(deque) == 0:
            print(-1)
        else:
            print(deque.popleft())
    elif cmd[0] == "4":
        if len(deque) == 0:
            print(-1)
        else:
            print(deque.pop())
    elif cmd[0] == "5":
        print(len(deque))
    elif cmd[0] == "6":
        if len(deque) == 0:
            print(1)
        else:
            print(0)
    elif cmd[0] == "7":
        if len(deque) == 0:
            print(-1)
        else:
            print(deque[0])
    elif cmd[0] == "8":
        if len(deque) == 0:
            print(-1)
        else:
            print(deque[-1])