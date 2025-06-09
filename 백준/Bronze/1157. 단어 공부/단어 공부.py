from collections import Counter

str = input().upper().strip()
c = Counter(str)
mc = c.most_common(2)

if len(mc) > 1 and mc[0][1] == mc[1][1]:
    print('?')
else:
    print(mc[0][0])