t = int(input())

for test in range(1, t + 1):
    arr = []
    n = int(input())
    cnt = 1

    while len(arr) != 10:
        target = cnt * n

        for c in str(target):
            if c not in arr:
                arr.append(c)
        cnt += 1
    print(f"#{test} {n * (cnt - 1)}")