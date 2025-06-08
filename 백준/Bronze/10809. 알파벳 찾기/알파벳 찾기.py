str = input()
alpha = [-1] * 26

for i in str:
    if alpha[ord(i) - ord('a')] != -1:
        continue
    alpha[ord(i) - ord('a')] += (str.index(i) + 1)

for i in alpha:
    print(i, end=' ')