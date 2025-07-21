t = int(input())
for _ in range(t):
    r, e, c = map(int, input().split())
    net = e - c
    if net > r:
        print("advertise")
    elif net < r:
        print("do not advertise")
    else:
        print("does not matter")
