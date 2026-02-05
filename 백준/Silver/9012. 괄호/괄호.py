import sys
input = sys.stdin.readline

n = int(input())
for _ in range(n):
    s = input().strip()
    stack = []
    for char in s:
        if stack and stack[-1] == '(' and char == ')':
            stack.pop()
        else:
            stack.append(char)
    if stack:
        print("NO")
    else:
        print("YES")