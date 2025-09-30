import sys

a,b,c = map(int,sys.stdin.readline().split())

def fpow(a, n, c):
    res = 1
    a = a % c
    while n:
        if n % 2 == 1:
            res = (a * res) % c
        a = (a * a) % c
        n //= 2
    return res

print(fpow(a,b,c))