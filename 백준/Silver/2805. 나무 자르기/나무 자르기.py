import sys

n,m = map(int,sys.stdin.readline().split())
tree = list(map(int,sys.stdin.readline().split()))

start = 1
end = max(tree)

while start <= end:
    mid = (start + end) // 2
    cnt = 0

    for i in tree:
        if i >= mid:
            cnt += i - mid

    if cnt >= m:
        start = mid + 1
    else:
        end = mid - 1
print(end)