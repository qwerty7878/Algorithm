str = input().upper()
word = list(set(str))
cnt = []

for i in word:
    count = str.count(i)
    cnt.append(count)

if cnt.count(max(cnt)) > 1:
    print('?')
else:
    print(word[cnt.index(max(cnt))])