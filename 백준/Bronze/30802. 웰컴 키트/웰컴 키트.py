import math

n = int(input())
sizes = list(map(int, input().split()))
t, p = map(int, input().split())

Tshirts = 0
for size in sizes:
    Tshirts += math.ceil(size / t)

print(Tshirts)
print(n // p, n % p)