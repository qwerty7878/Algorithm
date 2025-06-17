m = int(input())
n = int(input())

primeNum = []
for i in range(m,n + 1):

    if i == 1:
        continue
    if i == 2:
        primeNum.append(i)
        continue
    for j in range(2,i):
        if i % j == 0:
            break
        if i % j != 0 and i == (j + 1):
            primeNum.append(i)
            break
if len(primeNum) >= 1:
    print(sum(primeNum))
    print(min(primeNum))
else:
    print(-1)