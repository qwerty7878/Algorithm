import sys

n,c = map(int,sys.stdin.readline().split())
arr = []
for i in range(n):
    arr.append(int(sys.stdin.readline()))
arr.sort()

start = 1
end = arr[-1] - arr[0]
ans = 0

while start <= end:
    mid = (start + end) // 2
    cnt = 1
    temp = arr[0]

    for i in range(1, len(arr)):
        if arr[i] >= temp + mid:
            cnt += 1
            temp = arr[i]

    if cnt >= c:
        start = mid + 1
        ans = mid
    else:
        end = mid - 1
print(ans)