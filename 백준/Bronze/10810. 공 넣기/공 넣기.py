n,m = map(int,input().split())

arr = [0 for i in range(n)]

for _ in range(m):
    i,j,k = map(int,input().split())

    for a in range(i,j + 1):
        arr[a - 1] = k

for i in arr:
    print(i,end=" ")