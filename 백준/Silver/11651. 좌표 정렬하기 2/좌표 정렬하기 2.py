import sys

t = int(sys.stdin.readline())
arr = []

for i in range(t):
    [a,b] = map(int, sys.stdin.readline().split())
    arr.append([b,a])

arr.sort()

for i in range(t):
    print(arr[i][1], arr[i][0])