n = int(input())
num = 2
for i in range(n):
    # 1 2 4 8 16
    num += (2 ** i)
print(num ** 2)