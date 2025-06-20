import sys

arr = list(map(int, sys.stdin.readline().split()))

for i in range(1, len(arr)):
	if arr[i] > arr[i-1] and arr[i] - arr[i - 1] == 1:
		if i == len(arr) - 1:
			print('ascending')
	elif arr[i] < arr[i-1] and arr[i] - arr[i - 1] == -1:
		if i == len(arr) - 1:
			print('descending')
	else:
		print('mixed')
		break