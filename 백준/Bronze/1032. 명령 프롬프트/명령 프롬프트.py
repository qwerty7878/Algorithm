t = int(input())
arr = [input() for _ in range(t)]
ans = list(arr[0])

for word in arr[1:]:
    index = 0
    while index < len(word):
        if word[index] != ans[index]:
            ans[index] = '?'
        index += 1
print(''.join(ans))