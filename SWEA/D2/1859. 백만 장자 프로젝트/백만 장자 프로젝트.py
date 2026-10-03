t = int(input())
for test in range(1, t + 1):

    n = int(input())
    arr = list(map(int, input().split()))

    max_price = arr[-1]
    total = 0

    for idx in range(n - 2, -1, -1):
        if arr[idx] > max_price:
            max_price = arr[idx]
        total += (max_price - arr[idx])
    print(f"#{test} {total}")