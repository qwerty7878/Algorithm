m = int(input())
n = int(input())

arr = []
for i in range(m,n + 1):
    for j in range(2,n + 1):
        if i != j and i % j == 0:
            break
        elif i == j:
            arr.append(i)

if (len(arr) == 0):
    print(-1)
else:
    print(sum(arr))
    print(min(arr))