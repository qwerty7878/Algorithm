arr = []
for i in range(5):
    arr.append(int(input()))

arr.sort()
print(sum(arr) // len(arr))
print(arr[2])