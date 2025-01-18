arr = []

for _ in range(9):
    num = list(map(int, input().split()))
    arr.append(num)

for i in range(9):
    for j in range(9):
        if arr[i][j] == max(map(max,arr)):
            row,col = i + 1, j + 1

print(max(map(max,arr)))
print(row,col)