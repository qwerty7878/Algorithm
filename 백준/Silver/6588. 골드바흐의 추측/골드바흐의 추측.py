import math
import sys

primeList = [True] * 1000001
for i in range(2, int(math.sqrt(1000000)) + 1):
    if primeList[i]:
        for j in range(i * i, 1000001, i):
            primeList[j] = False

while True:
    n = int(sys.stdin.readline().strip())
    if n == 0:
        break

    for i in range(n - 3, 2, -2):
        if primeList[i] and primeList[n - i]:
            print(f"{n} = {n - i} + {i}")
            break
    else:
        print('"Goldbach\'s conjecture is wrong."')