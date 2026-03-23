arr = []
for _ in range(4):
    arr.append(int(input()))

arr.sort()
arr.remove(arr[0])

a = int(input())
b = int(input())

maxnum = max(a, b)
arr.append(maxnum)

print(sum(arr))