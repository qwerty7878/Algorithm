import sys

n,m = map(int,sys.stdin.readline().split())
arr = [i for i in range(1,n + 1)]

for i in range(m):
    a,b = map(int,sys.stdin.readline().split())
    temp = arr[a - 1]
    arr[a - 1] = arr[b - 1]
    arr[b - 1] = temp

for i in range(n):
    print(arr[i],end=" ")

# for i in arr:
#     print(i,end=" ")
