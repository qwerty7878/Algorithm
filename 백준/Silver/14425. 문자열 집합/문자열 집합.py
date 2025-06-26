import sys

n,m = (map(int,sys.stdin.readline().split()))

arr = []
for i in range(n):
    arr.append(sys.stdin.readline())
arr = set(arr)

count = 0
for i in range(m):
    if sys.stdin.readline() in arr:
        count += 1
print(count)