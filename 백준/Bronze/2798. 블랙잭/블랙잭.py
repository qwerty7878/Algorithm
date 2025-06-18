n,m = map(int,input().split())
arr = list(map(int,input().split()))
sum = 0
for i in range(n):
    for j in range(n):
        for k in range(n):
            if arr[i] == arr[j] or arr[i] == arr[k] or arr[j] == arr[k]:
                continue
            else:
                if arr[i] + arr[j] + arr[k] <= m and sum < arr[i] + arr[j] + arr[k]:
                   sum = arr[i] + arr[j] + arr[k]
                elif arr[i] + arr[j] + arr[k] > m:
                    continue
print(sum)