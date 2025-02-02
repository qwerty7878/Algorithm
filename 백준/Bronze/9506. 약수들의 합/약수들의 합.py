while True:
    n = int(input())
    if n == -1:
        break

    arr = []
    sum = 0
    for i in range(1, n):
        if n % i == 0:
            arr.append(i)
            sum += i

    if sum == n:
        print(f'{n} = ',end='')
        for i in arr:
            if i != arr[-1]:
                print(f'{i} + ',end='')
            else:
                print(f'{i}')
    else:
        print(f'{n} is NOT perfect.')