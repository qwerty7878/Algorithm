n,m = map(int,input().split())
arr = [0] * n

for a in range(m):
    i,j,k = map(int,input().split())
    for b in range(i,j+1):
        arr[b - 1] = k

print(*arr)