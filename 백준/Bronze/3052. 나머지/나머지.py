cnt = []
for i in range(10):
    num = int(input())
    cnt.append(num % 42)

cnt = sorted(set(cnt))
print(len(cnt))