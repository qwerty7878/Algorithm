n = int(input())

arr = []
index = 2

while n != 1:
    if n % index == 0:
        arr.append(index)
        n /= index
    else:
        index += 1

for i in arr:
    print(i)