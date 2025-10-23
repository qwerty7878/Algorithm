e,s,m = map(int,input().split())

idx = 1
while True:
    if (idx - e) % 15 == 0 and (idx - s) % 28 == 0 and (idx - m) % 19 == 0:
        print(idx)
        break
    idx += 1