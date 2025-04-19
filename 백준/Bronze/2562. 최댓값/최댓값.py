arr = []

for i in range(9):
    arr.append(int(input()))

print(max(arr))
print(arr.index(max(arr)) + 1) # 0 부터 시작이니까