import sys

t = int(sys.stdin.readline())
for i in range(t):
    n,m = map(int, sys.stdin.readline().split())
    if n >= m:
        print("MMM BRAINS")
    else:
        print("NO BRAINS")