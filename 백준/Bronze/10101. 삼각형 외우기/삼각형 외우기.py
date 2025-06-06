angle = []
for i in range(3):
    angle.append(int(input()))

if sum(angle) != 180:
    print('Error')
else:
    if angle[0] == angle[1] and angle[1] == angle[2] and angle[2] == angle[0]:
        print('Equilateral')
    elif angle[0] != angle[1] and angle[1] != angle[2] and angle[2] != angle[0]:
        print('Scalene')
    else:
        print('Isosceles')