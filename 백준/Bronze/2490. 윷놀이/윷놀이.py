for i in range(3):
    arr = list(map(int, input().split()))
    sum(arr)
    if sum(arr) == 0:
        print("D")
    elif sum(arr) == 1:
        print("C")
    elif sum(arr) == 2:
        print("B")
    elif sum(arr) == 3:
        print("A")
    elif sum(arr) == 4:
        print("E")