s = input().lower()
arr = [-1] * 26
alpha = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

for char in s:
    idx = alpha.index(char)
    pos = s.index(char) + 1

    if arr[idx] == -1:
        arr[idx] += pos

print(' '.join(map(str, arr)))