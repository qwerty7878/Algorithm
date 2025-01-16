n,m = map(int,input().split())
arr = list(map(int,input().split()))

start,end = max(arr), sum(arr)

while start <= end:
    mid = (start + end) // 2
    cnt = 1
    tmp = 0

    for i in arr:
        if tmp + i > mid:
            cnt += 1
            tmp = 0
        tmp += i

    if cnt <= m:
        ans = mid
        end = mid - 1
    else:
        start = mid + 1

print(ans)