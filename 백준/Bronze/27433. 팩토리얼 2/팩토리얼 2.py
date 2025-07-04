import sys
from math import factorial

def fac(n):
    if n == 0 or n == 1:
        return 1
    return n * fac(n - 1)

n = int(sys.stdin.readline())
# print(factorial(n))
print(fac(n))