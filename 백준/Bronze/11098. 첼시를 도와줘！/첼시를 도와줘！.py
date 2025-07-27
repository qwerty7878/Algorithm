t = int(input())

for i in range(t):
    n = int(input())
    arr = {}
    list = []
    for j in range(n):
        price,name = input().split()
        price = int(price)
        list.append(price)
        list.sort()

        arr[price] = name
    print(arr[max(list)])