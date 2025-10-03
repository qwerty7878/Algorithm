import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())
num = list(map(int, sys.stdin.readline().split()))

num.sort()

cnt = 0
start = 0
end = len(num) - 1

while start < end:
    if num[start] + num[end] == m:
        start += 1
        end -= 1
        cnt += 1
    elif num[start] + num[end] < m:
        start += 1
    elif num[start] + num[end] > m:
        end -= 1
print(cnt)