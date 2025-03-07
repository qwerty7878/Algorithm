import sys

n = int(sys.stdin.readline())
cnt = [0] * 10001

for i in range(n):
    num = int(sys.stdin.readline())
    cnt[num] += 1

for i in range(10001):
    if cnt[i] != 0:
        for j in range(cnt[i]):
            print(i)