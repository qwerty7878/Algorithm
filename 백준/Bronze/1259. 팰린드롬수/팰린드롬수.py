while True:
    n = int(input())
    if n == 0:
        break
    word = str(n)
    isReverse = word[::-1]
    # print(isReverse)
    if word == isReverse:
        print("yes")
    else:
        print("no")