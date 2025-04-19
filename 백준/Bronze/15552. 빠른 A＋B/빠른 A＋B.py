import sys

n = int(sys.stdin.readline())
arr = []
for i in range(n):
    sum = 0
    a,b = map(int, sys.stdin.readline().split())
    sum = a + b
    arr.append(sum)

for i in range(n):
    print(arr[i])