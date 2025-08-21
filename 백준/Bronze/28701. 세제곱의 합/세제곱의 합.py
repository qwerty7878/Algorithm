import sys

n = int(sys.stdin.readline())

sum = 0
for i in range(1, n + 1):
    sum += i
print(sum)
print(sum ** 2)

sum = 0
for i in range(1, n + 1):
    sum += i ** 3
print(sum)