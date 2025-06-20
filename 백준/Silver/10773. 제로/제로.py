t = int(input())

stack = []
for i in range(t):
    k = input()

    if k == '0':
        if len(stack) > 0:
            stack.pop()
    else:
        stack.append(int(k))

print(sum(stack))