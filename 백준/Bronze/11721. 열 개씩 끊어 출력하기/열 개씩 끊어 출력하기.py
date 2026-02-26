s = input()

for idx in range(len(s)):
    if idx % 10 == 0 and idx > 1:
        print()
        print(s[idx],end='')
    else:
        print(s[idx],end='')