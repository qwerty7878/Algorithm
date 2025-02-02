import math

a,b,v = map(int,input().split())
day = 1
v -= a
climb = a - b
day += math.ceil(v / climb)

print(day)