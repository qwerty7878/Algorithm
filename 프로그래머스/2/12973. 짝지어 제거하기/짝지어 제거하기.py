def solution(s):
    answer = -1
    stack = []
    
    for char in s:
        if not stack:
            stack.append(char)
        else:
            if stack[-1] == char:
                stack.pop()
            else:
                stack.append(char)
    
    if stack:
        answer = 0
    else:
        answer = 1

    return answer