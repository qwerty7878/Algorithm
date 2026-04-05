arr = [i for i in range(10)]
num = [0] * 10

n = input()

for c in n:
    if int(c) in arr:
        idx = arr.index(int(c))
        num[idx] += 1
print(' '.join(map(str, arr)))
print(' '.join(map(str, num)))