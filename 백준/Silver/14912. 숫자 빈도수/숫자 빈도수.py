n, target = input().split()
count = 0

for num in range(1, int(n) + 1):
    if target in str(num):
        count += str(num).count(target)

print(count)