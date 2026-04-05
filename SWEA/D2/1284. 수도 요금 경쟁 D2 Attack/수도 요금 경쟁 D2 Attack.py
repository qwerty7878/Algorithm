t = int(input())

for test in range(t):
    p,q,r,s,w = map(int, input().split())
    a = w * p

    # b사
    over = w - r
    b = q
    if over > 0:
        b += (s * over)

    ans = min(a, b)
    print(f"#{test + 1} {ans}")