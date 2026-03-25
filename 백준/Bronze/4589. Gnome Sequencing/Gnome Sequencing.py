n = int(input())

print("Gnomes:")
for _ in range(n):
    base = list(map(int, input().split()))

    decArr = sorted(base, reverse=True)
    ascArr = sorted(base)

    if base == decArr or base == ascArr:
        print("Ordered")
    else:
        print("Unordered")