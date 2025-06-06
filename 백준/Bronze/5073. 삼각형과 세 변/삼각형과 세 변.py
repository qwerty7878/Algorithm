while True:
    angle = list(map(int, input().split()))
    if angle[0] == 0 and angle[1] == 0 and angle[2] == 0:
        break

    if max(angle) >= sum(angle) - max(angle):
        print('Invalid')
    else:
        if angle[0] == angle[1] and angle[1] == angle[2] and angle[2] == angle[0]:
            print('Equilateral')
        elif angle[0] != angle[1] and angle[1] != angle[2] and angle[2] != angle[0]:
            print('Scalene')
        else:
            print('Isosceles')