n = int(input())
for i in range(n):
    print(' ' * (n - (i + 1)) + '*' * (2 * (i + 1) - 1))

for i in range(n):
    print(' ' * (i + 1) + '*' * ((2 * (n - i - 1)) - 1))