import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
cnt = 0

arr.sort()
for i in range(n):
    start = 0
    end = n - 1

    while start < end:
        if arr[start] + arr[end] == arr[i]:
            if start != i and end != i:
                cnt += 1
                break
            elif start == i:
                start += 1
            elif end == i:
                end -= 1
        elif arr[start] + arr[end] < arr[i]:
            start += 1
        else:
            end -= 1
print(cnt)