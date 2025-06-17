n = int(input())
list = list(map(int, input().split()))
count = 0

for i in list:
    if i == 1:
        continue
    if i == 2:
        count += 1
        continue
    for j in range(2, i):
        if i % j == 0:
            break
        if i == (j + 1) and i % j != 0:
            count += 1

print(count)