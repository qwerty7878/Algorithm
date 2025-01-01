arr = []

for i in range(9):
    arr.append(list(map(int, input().split())))

maxNum = 0
row = 0
col = 0

for i in range(9):
    for j in range(9):
        if arr[i][j] >= maxNum:
        # if arr[i][j] > maxNum: 로 하면 이 전에 같은 경우일 때 행 렬이 그대로 되어 있음
            maxNum = arr[i][j]
            row = i + 1
            col = j + 1

print(maxNum)
print(row, col)