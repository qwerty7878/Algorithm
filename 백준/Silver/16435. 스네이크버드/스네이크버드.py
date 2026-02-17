n, l = map(int, input().split())
fruits = list(map(int, input().split()))
fruits.sort()

for i in range(n):
    if fruits[0] <= l:
        fruits.remove(fruits[0])
        l += 1
    else:
        break
print(l)