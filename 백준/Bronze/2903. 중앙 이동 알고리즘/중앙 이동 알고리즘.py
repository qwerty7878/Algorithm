import math

n = int(input())

arr = [0] * (n + 1)

arr[0] = 4

for i in range(1, n + 1):
	arr[i] = ((math.sqrt(arr[i - 1]) * 2) - 1) ** 2

print(int(arr[n]))