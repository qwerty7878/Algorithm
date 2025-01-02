a,b = map(int,input().split())
m = int(input())
b = b + m
if(b + m < 60):
    print(a,b)
else:
    a = a + (b // 60)
    if(a > 23):
        a = a % 24
        print(a,b % 60)
    else:
        print(a, b % 60)