t = int(input())

arr = []
for num in range(1, t + 1):
    s = str(num)
    count = 0
    for char in s:
        if char in ['3','6','9']:
            count += 1

    if count > 0:
       arr.append('-' * count)
    else:
        arr.append(s)

print(' '.join(arr))