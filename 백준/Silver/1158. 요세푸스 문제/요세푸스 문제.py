import sys
from collections import deque

n,k = map(int,sys.stdin.readline().split())
st = deque(i for i in range(1,n+1))
arr = []
while st:
    for i in range(k - 1):
        st.append(st.popleft())
    arr.append(st.popleft())
print('<', end='')
print(', '.join(map(str,arr)), end='')
print('>')