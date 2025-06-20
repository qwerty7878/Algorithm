import sys

t = int(sys.stdin.readline())

for i in range(t):
	str = sys.stdin.readline()

	count = 0
	sum = 0
	for i in str:
		if i == 'O':
			count += 1
			sum += count
		elif i == 'X':
			count = 0
			sum += count

	print(sum)