start = input()

if start != '0':
    if len(start) > 1:
        newNum = start
    else:
        start = '0' + start
        
    newNum = start
    first = start[1]
    count = 0

    while True:
        total = 0
        for num in newNum:
            total += int(num)
        second = str(total % 10)
        newNum = first + second
        first = newNum[1]
        count += 1

        if newNum == start:
            print(count)
            break
else:
    print(1)