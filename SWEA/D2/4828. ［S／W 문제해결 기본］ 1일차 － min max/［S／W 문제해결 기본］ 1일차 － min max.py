t = int(input())

for test in range(t):
    n = int(input())
    arr = list(map(int, input().split()))

    minnum = min(arr)
    maxnum = max(arr)

    ans = maxnum - minnum
    print(f"#{test + 1} {ans}")