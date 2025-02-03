import math

m = int(input())
n = int(input())
arr = []

for i in range(m,n + 1):
    if i < 2:
        continue

    isPrime = True
    for j in range(2, int(math.sqrt(i)) + 1):
        if i % j == 0:
            isPrime = False
            break

    if isPrime:
        arr.append(i)

if len(arr) != 0:
    print(sum(arr))
    print(min(arr))
else:
    print(-1)