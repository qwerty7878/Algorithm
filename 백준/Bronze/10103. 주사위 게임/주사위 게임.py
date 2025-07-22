import sys

t = int(sys.stdin.readline())
chang,sang = 100,100

for i in range(t):
    a,b = map(int,sys.stdin.readline().split())
    if a > b:
        sang -= a
    elif a < b:
        chang -= b
    else:
        continue
print(chang,sang,sep='\n')