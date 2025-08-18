import sys
from collections import deque

n = int(sys.stdin.readline())
st = deque(enumerate(map(int, sys.stdin.readline().split())))
arr = []

while st:
    idx, tempNum = st.popleft()
    arr.append(idx + 1)

    if len(st) > 0:
        if tempNum > 0:
            for i in range(tempNum - 1):
                st.append(st.popleft())
        else:
            for i in range(abs(tempNum)):
                st.appendleft(st.pop())
    else:
        break
print(*arr)