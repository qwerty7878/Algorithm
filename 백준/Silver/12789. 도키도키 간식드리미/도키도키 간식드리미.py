import sys
from collections import deque

n = int(sys.stdin.readline())
waitline = deque(list(map(int, sys.stdin.readline().split())))
temp = []

num = 1
while waitline:
    if waitline[0] == num:
        waitline.popleft()
        num += 1
    else:
        temp.append(waitline.popleft())

    while temp:
        if temp[-1] == num:
            temp.pop()
            num += 1
        else:
            break

if len(temp) == 0:
    print('Nice')
else:
    print('Sad')