import math

n = int(input())
arr = [0] * 17

arr[0] = 4
arr[1] = 9
arr[2] = 25

for i in range(3, n + 1):
    arr[i] = ((math.sqrt(arr[i - 1]) * 2) - 1) ** 2

print(int(arr[n]))