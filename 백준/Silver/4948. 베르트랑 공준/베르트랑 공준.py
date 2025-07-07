import math
import sys

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

while True:
    n = int(sys.stdin.readline())
    if n == 0:
        break
    elif n == 1:
        print(1)
    else:
        cnt = 0
        for i in range(n + 1,(2 * n) + 1):
            if isPrime(i):
                cnt += 1
        print(cnt)