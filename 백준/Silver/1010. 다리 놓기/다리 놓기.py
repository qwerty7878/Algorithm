import sys

def fac(n):
      if n < 2:
            return 1
      else:
            return n * fac(n-1)

t = int(sys.stdin.readline())

for i in range(t):
      n,m = map(int, sys.stdin.readline().split())
      print(fac(m) // (fac(m-n) * fac(n)))