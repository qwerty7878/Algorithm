a,b,c = map(int,input().split())

if a == b and b == c and c == a:
    print(10000 + (a * 1000))
elif a != b and  a != c and b != c:
    print(max(a,b,c) * 100)
else:
    if a == b:
        print(1000 + (a * 100))
    if a == c:
        print(1000 + (a * 100))
    if c == b:
        print(1000 + (c * 100))