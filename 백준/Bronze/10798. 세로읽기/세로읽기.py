arr = []

for _ in range(5):
    word = list(input().strip())
    arr.append(word)

for i in range(15):
    for j in range(5):
        if i < len(arr[j]):
            print(arr[j][i], end='')