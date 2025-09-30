a,b = map(int,input().split())

cnt = 0
while b != a:
    if a > b:
        print(-1)
        exit(0)

    if b % 2 == 0:
        b //= 2
        cnt += 1
    elif str(b).endswith('1'):
        b //= 10
        cnt += 1
    else:
        print(-1)
        exit(0)
print(cnt + 1)