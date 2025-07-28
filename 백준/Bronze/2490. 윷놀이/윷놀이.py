for i in range(3):
    yut = list(map(int, input().split()))
    sum(yut)

    if sum(yut) == 3:
        print('A')
    elif sum(yut) == 2:
        print('B')
    elif sum(yut) == 1:
        print('C')
    elif sum(yut) == 0:
        print('D')
    else:
        print('E')