import sys

a,b,c,d,e,f = map(int, sys.stdin.readline().split())

# x
x = ((e * c) - (b * f)) // ((a * e) - (b * d))

# y
y = ((f * a) - (c * d)) // ((e * a) - (b * d))

print(x,y)