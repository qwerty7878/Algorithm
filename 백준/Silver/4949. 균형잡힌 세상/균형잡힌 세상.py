import sys
input = sys.stdin.readline

while True:
    word = input()

    if word.startswith('.'):
        break

    stack = []
    for char in word:
        if char == '[' or char == '(':
            stack.append(char)
        elif char == ']' or char == ')':
            if not stack:
                stack.append(char)
                break
            elif stack[-1] == '(' and char ==')':
                stack.pop()
            elif stack[-1] == '[' and char ==']':
                stack.pop()
            else:
                stack.append(char)
    if stack:
        print('no')
    else:
        print('yes')