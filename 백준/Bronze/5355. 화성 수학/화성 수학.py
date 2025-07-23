t = int(input())
for i in range(t):
    arr = input().split()
    ans = 0
    for i in arr:
        if i == '@':
            ans *= 3
        elif i == '%':
            ans += 5
        elif i == '#':
            ans -= 7
        else:
            ans += float(i)
    print(f"{ans:0.2f}")