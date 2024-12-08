import sys

n,m = map(int,sys.stdin.readline().split())
list = [0] * n
for t in range(m):
    a,b,c, = map(int,sys.stdin.readline().split())

    for i in range(a,b + 1):
        list[i - 1] = c

for i in range(n):
    print(list[i],end=" ")