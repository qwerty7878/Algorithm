n,m = map(int,input().split())
arr = [i for i in range(1,n + 1)]

for i in range(m):
    x,y = map(int,input().split())
    temp = arr[x-1:y]
    temp.reverse()
    arr[x-1:y] = temp

for i in range(n):
    print(arr[i], end=" ")