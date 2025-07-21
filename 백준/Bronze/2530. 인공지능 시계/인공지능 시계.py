a,b,c = map(int,input().split())
d = int(input())

d = d + c
m = d // 60

b = b + m
c = d % 60

if b >= 60:
    a = a + b // 60
    b = b % 60

    if a > 23:
        a = a % 24

print(a,b,c)