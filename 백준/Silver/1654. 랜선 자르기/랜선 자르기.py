import sys

k,n = map(int, sys.stdin.readline().split())
arr = []
for i in range(k):
    arr.append(int(sys.stdin.readline()))

start = 1
end = max(arr)
while start <= end:
    mid = (start + end) // 2
    cnt = 0

    for i in arr:
        cnt += i // mid

    if cnt >= n:
        start = mid + 1
    else:
        end = mid - 1
print(end)