n,m = map(int,input().split())
arr = list(map(int,input().split()))
s = [0]
c = [0] * m

for i in range(n):
    s.append(s[i] + arr[i])

ans = 0
for i in range(1, n + 1):
    remain = s[i] % m
    if remain == 0:
        ans += 1
    c[remain] += 1

for i in range(m):
    if c[i] > 1:
        ans += c[i] * (c[i] - 1) // 2
print(ans)