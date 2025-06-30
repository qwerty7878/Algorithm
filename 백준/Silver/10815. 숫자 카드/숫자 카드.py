import sys

m = int(sys.stdin.readline())
cardA = set(map(int, sys.stdin.readline().split()))
n = int(sys.stdin.readline())
cardB = list(map(int, sys.stdin.readline().split()))

for i in cardB:
    if i in cardA:
        print(1,end=' ')
    else:
        print(0,end=' ')