a,b = input().split()

reva = int(a[::-1])
revb = int(b[::-1])

ans = reva + revb
print(int(str(ans)[::-1]))