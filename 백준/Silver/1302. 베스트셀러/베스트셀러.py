from collections import Counter

n = int(input())
books = []

for i in range(n):
    books.append(input())

count = Counter(books).most_common()
# print(count)

ans = []
maxcount = count[0][1]
# print(maxcount)
for name, cnt in count:
    if cnt == maxcount:
        ans.append(name)
ans.sort()
print(ans[0])