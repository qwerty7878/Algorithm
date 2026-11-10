t = int(input())

for test in range(1, t + 1):
    stack = []
    s = input()

    for c in s:
        if not stack:
            stack.append(c)
        else:
            if stack[-1] == c:
                stack.pop()
            else:
                stack.append(c)

    print(f"#{test} {len(stack)}")