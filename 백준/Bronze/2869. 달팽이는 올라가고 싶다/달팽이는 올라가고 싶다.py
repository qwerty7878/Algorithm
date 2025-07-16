import math
import sys

a,b,v = map(int,sys.stdin.readline().split())
day = 1
diff = a - b
v -= a
day += math.ceil(v / diff)
print(day)