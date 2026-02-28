arr = list(map(int, input().split()))

target = min(arr)
divcount = 0

while True:
    for i in arr:
        if target % i == 0:
            divcount += 1

    if divcount >= 3:
        break

    divcount = 0
    target += 1
print(target)