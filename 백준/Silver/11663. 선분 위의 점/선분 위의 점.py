import sys
from bisect import bisect_left, bisect_right

n,m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
arr.sort()

for i in range(m):
    start,end = map(int, sys.stdin.readline().split())
    start = bisect_left(arr, start)
    end = bisect_right(arr, end)
    print(end - start)