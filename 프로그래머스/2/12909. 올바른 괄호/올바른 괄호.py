def solution(s):
    stack = []
    for char in s:
        if not stack:
            stack.append(char)
        else:
            if char == '(':
                stack.append(char)
            else:
                stack.pop()
        # print(stack)
    if not stack:
        return True
    else:
        return False