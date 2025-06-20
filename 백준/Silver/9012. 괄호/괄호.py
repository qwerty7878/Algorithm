import sys

t = int(sys.stdin.readline())
answer = []
for i in range(t):
    str = sys.stdin.readline().strip()
    stack = []

    for j in str:

        if j == '(':
            stack.append(j)
        elif j == ')':
            if len(stack) > 0 and stack[-1] == '(':
                stack.pop()
            else:
                stack.append(j)

    if len(stack) > 0:
        answer.append('NO')
    else:
        answer.append('YES')

for i in answer:
    print(i)