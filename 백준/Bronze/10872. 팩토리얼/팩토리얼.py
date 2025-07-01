import sys

def fac(n):
    if n == 0:
        return 1
    if n == 1:
        return 1
    if n == 2:
        return 2
    return n * fac(n - 1)

n = int(sys.stdin.readline())
print(fac(n))