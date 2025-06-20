import sys

answer = []
while True:
	str = sys.stdin.readline().rstrip()
	stack = []

	if str == '.':
		break

	for j in str:
		if j == '(' or j == '[':
			stack.append(j)
		elif j == ')':
			if len(stack) > 0 and stack[-1] == '(':
				stack.pop()
			else:
				stack.append(j)
		elif j == ']':
			if len(stack) > 0 and stack[-1] == '[':
				stack.pop()
			else:
				stack.append(j)

	if len(stack) > 0:
		answer.append('no')
	else:
		answer.append('yes')

for i in answer:
	print(i)