import sys
from collections import deque

t = int(input())

for _ in range(t):
    ans = []
    p = sys.stdin.readline().strip()
    n = int(sys.stdin.readline())
    temp = sys.stdin.readline().strip()
    isReverse = False

    if n == 0:
        arr_list = deque()
    else:
        arr_list = temp[1:len(temp)-1].split(',')
        arr_list = deque(arr_list)

    for char in p:
        if char == 'R':
            isReverse = not isReverse
        elif char == 'D':
            if arr_list:
                if isReverse:
                    arr_list.pop()
                else:
                    arr_list.popleft()
            else:
                ans.append('error')
                break

    if len(ans) == 0:
        if isReverse:
            arr_list.reverse()

        print('[' + ','.join(map(str, arr_list)) + ']')
    else:
        print(*ans)