while True:
    angle1,angle2,angle3 = map(int,input().split())
    arr = [angle1, angle2, angle3]
    arr.sort()

    if angle1 == 0 and angle2 == 0 and angle3 == 0:
        break

    if arr[0] + arr[1] > arr[2]:
        if angle1 == angle2 and angle2 == angle3 and angle1 == angle3:
            print('Equilateral')
        elif angle1 == angle2 or angle2 == angle3 or angle1 == angle3:
            print('Isosceles')
        elif angle1 != angle2 and angle2 != angle3 and angle1 != angle3:
            print('Scalene')
    else:
        print('Invalid')
