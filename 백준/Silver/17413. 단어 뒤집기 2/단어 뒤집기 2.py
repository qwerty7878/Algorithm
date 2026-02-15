s = input()
arr = []
rev = []

for char in s:
    if char == '<':
        if rev:
            print(''.join(rev[::-1]), end='')
            rev.clear()
        arr.append(char)
    elif '<' in arr:
        if char != '>':
            arr.append(char)
        else:
            arr.append(char)
            print(''.join(arr),end='')
            arr.clear()
    elif char != '<' and not arr:
        if rev:
            if char == ' ':
                print(''.join(rev[::-1]),end='')
                print(' ',end='')
                rev.clear()
            else:
                rev.append(char)
        else:
            rev.append(char)
if rev:
    print(''.join(rev[::-1]),end='')