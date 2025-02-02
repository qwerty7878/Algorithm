import math

n = int(input())
arr = list(map(int, input().split()))
cnt = 0

for i in arr:
    if i < 2:
        continue

    isPrime = True
    for j in range(2, int(math.sqrt(i)) + 1):
        if i % j == 0:
            isPrime = False
            break

    if isPrime:
        cnt += 1

print(cnt)