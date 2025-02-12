n = int(input())

for i in range(1, n + 1):
    res = i + sum(map(int, str(i)))
    if res == n:
        print(i)
        break

else:
    print(0)