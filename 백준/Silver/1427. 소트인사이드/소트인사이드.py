s = input()

arr = []
for i in s:
    arr.append((i))

arr.sort(reverse=True)

for i in arr:
    print(i,end='')