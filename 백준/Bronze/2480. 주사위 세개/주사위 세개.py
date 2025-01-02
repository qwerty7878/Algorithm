a,b,c = map(int, input().split())
prize = 0
if(a == b and b == c and a == c):
    prize = 10000 + (a * 1000)
    print(prize)
elif(a != b and b != c and a != c):
    prize = max(a,b,c) * 100
    print(prize)
else:
    if(a == b):
        prize = 1000 + (a * 100)
    elif (a == c):
        prize = 1000 + (a * 100)
    elif (c == b):
        prize = 1000 + (b * 100)
    print(prize)