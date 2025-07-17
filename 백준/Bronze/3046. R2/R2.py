import sys

r1,s = map(int,sys.stdin.readline().split())
# s = (r1 + r2) // 2
r2 = 2 * s - r1
print(r2)