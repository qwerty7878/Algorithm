h = int(input())
m = int(input())

if h < 2:
    print("Before")
elif h == 2:
    if m == 18:
        print("Special")
    elif m < 18:
        print("Before")
    else:
        print("After")
else:
    print("After")