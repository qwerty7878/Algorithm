import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
newa = set(a)
m = int(sys.stdin.readline())
b = list(map(int, sys.stdin.readline().split()))

for i in b:
    if i in newa:
        print(1)
    else:
        print(0)