import sys

n = int(sys.stdin.readline())
stack = []

for i in range(n):
	arr = sys.stdin.readline().split()
	x = arr[0]

	if x == '2':
		if len(stack) != 0:
			print(stack.pop())
		else:
			print(-1)

	elif x == '3':
		print(len(stack))

	elif x == '4':
		if len(stack) != 0:
			print(0)
		else:
			print(1)

	elif x == '5':
		if len(stack) == 0:
			print(-1)
		else:
			print(stack[-1])

	elif x == '1':
		stack.append(arr[1])