n = int(input())
x = int(input())

a = (n - x) // 2
b = n - a

maxn = max(a, b)
minn = min(a, b)

print(maxn)
print(minn)