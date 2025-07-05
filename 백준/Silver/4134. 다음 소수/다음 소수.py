import math
import sys

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

t = int(sys.stdin.readline())
for i in range(t):
    n = int(sys.stdin.readline())
    while True:
        if isPrime(n):
            print(n)
            break
        n += 1