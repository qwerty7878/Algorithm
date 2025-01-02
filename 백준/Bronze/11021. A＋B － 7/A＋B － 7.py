import sys

t = int(sys.stdin.readline())

for i in range(t):
    a,b = map(int, sys.stdin.readline().split())
    print('Case #',end='')
    print((i + 1),end='')
    print(': ',end='')
    print(a + b)