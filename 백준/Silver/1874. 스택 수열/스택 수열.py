import sys
from collections import deque

n = int(sys.stdin.readline())
st = deque()
arr = []
temp = 1

for _ in range(n):
    number = int(sys.stdin.readline())
    while temp <= number:
        st.append(temp)
        arr.append('+')
        temp += 1

    if number == st[-1]:
        st.pop()
        arr.append('-')

    elif number not in st:
        break

if len(st) != 0:
    print('NO')
else:
    print('\n'.join(arr))