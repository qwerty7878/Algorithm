while True:
    staff = list(map(int,input().split()))

    if staff[0] == 0 and staff[1] == 0 and staff[2] == 0:
        break

    if max(staff) >= sum(staff) - max(staff):
        print('Invalid')
    else:
        if staff[0] == staff[1] and staff[1] == staff[2] and staff[0] == staff[2]:
            print('Equilateral')
        elif staff[0] != staff[1] and staff[1] != staff[2] and staff[0] != staff[2]:
            print('Scalene')
        else:
            print('Isosceles')