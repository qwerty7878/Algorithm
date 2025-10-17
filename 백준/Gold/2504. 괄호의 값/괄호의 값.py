import sys

s = sys.stdin.readline().strip()
stack = []
ans = 0
isOpen = False

temp = 1
for idx in range(len(s)):
    if s[idx] == '(':
        stack.append(s[idx])
        temp *= 2
    elif s[idx] == '[':
        stack.append(s[idx])
        temp *= 3
    elif s[idx] == ')':
        if not stack or stack[-1] != '(':
            ans = 0
            break
        if s[idx-1] == '(':
            ans += temp
        stack.pop()
        temp //= 2
    elif s[idx] == ']':
        if not stack or stack[-1] != '[':
            ans = 0
            break
        if s[idx-1] == '[':
            ans += temp
        stack.pop()
        temp //= 3

if stack:
    print(0)
else:
    print(ans)