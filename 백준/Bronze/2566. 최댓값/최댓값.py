arr = []
max = 0
for i in range(9):
    arr.append(list(map(int, input().split())))
    for j in arr[i]:
        if max <= j:
            max = j

print(max)
for i in range(9):
    for j in range(9):
        if arr[i][j] == max:
            print(i + 1, j + 1)
            break