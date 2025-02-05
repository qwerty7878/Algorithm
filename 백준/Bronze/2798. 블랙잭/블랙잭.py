n,m = map(int,input().split())
arr = list(map(int,input().split()))

sum = 0
sumArr = []
for i in range(0, n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            sum = arr[i] + arr[j] + arr[k]
            if sum <= m:
                sumArr.append(sum)

print(max(sumArr))