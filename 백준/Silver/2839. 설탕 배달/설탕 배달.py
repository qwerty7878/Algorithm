n = int(input())

arr = []
five = 0
while True:
    if n % 3 == 0:
        arr.append((n // 3) + five)

    n -= 5
    five += 1

    if n < 0:
        break

if arr:
    print(min(arr))
else:
    print(-1)