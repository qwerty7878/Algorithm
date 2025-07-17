import sys

n = int(sys.stdin.readline())
temp = 1
sum = 0
fit = False
while True:
    sum += temp

    if sum >= n:
        if sum == n:
            fit = True
        break
    else:
        temp += 1

if fit:
    print(temp)
else:
    print(temp - 1)