import sys

n,m = map(int,sys.stdin.readline().split())
arr = list(map(int,sys.stdin.readline().split()))
prefix_sum = [0]

for i in range(n):
    prefix_sum.append(prefix_sum[i] + arr[i])

for _ in range(m):
    i,j = map(int,sys.stdin.readline().split())
    sub_sum = prefix_sum[j] - prefix_sum[i - 1]
    print(sub_sum)