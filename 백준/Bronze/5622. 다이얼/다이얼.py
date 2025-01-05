dial = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
word = input()
ans = 0
for i in dial:
    for j in word:
        if j in i:
            ans += dial.index(i) + 2

ans += len(word)
print(ans)