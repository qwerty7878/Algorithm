def solution(s):
    answer = -1
    stack = []
    
    for i in s:
        if len(stack) == 0:
            stack.append(i)
        
        elif stack[-1] == i:
            stack.pop()
        else:
            stack.append(i)
        # print(stack)
        
    if len(stack) == 0:
        answer = 1
    else:
        answer = 0
        
    return answer