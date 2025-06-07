arr = [i for i in range(1,31)]
list(arr)

for i in range(28):
    num = int(input())
    if num in arr:
        arr.remove(num)

for i in arr:
    print(i)