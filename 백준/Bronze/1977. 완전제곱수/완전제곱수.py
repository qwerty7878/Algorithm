import math

n = int(input())
m = int(input())

arr = []
for i in range(n, m + 1):
    num = math.sqrt(i)
    if int(num) ** 2 == i:
        arr.append(i)
    else:
        continue

if sum(arr) == 0:
    print(-1)
else:
    print(sum(arr))
    print(min(arr))