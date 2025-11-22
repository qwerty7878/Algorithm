t = int(input())

for _ in range(t):
    a,b = map(int, input().split())
    target = a % 10

    if target == 0:
        print(10)
    elif target in [1, 5, 6]:
        print(target)
    elif target in [4, 9]:
        temp = b % 2
        if temp == 0:
            print(target ** 2 % 10)
        else:
            print(target)
    else:
        temp = b % 4
        if temp == 0:
            print(target ** 4 % 10)
        else:
            print(target ** temp % 10)