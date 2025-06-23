def facto(n):
    if n == 0 or n == 1:
        return 1
    elif n == 2:
        return 2
    else:
        return n * facto(n - 1)

n = int(input())
num = str(facto(n))
s = num[::-1]
count = 0

for i in s:
    if i == '0':
        count += 1
    else:
        break
print(count)