import math
import sys

a,b = map(int, sys.stdin.readline().split())
print(a * b // math.gcd(a, b))