from collections import deque

def makeStack(array):
    stack = []
    for char in array:
        if not stack:
            stack.append(char)
        else:
            if char == ']' and stack[-1] == '[':
                stack.pop()
            elif char == '}' and stack[-1] == '{':
                stack.pop()
            elif char == ')' and stack[-1] == '(':
                stack.pop()
            else:
                stack.append(char)
    return stack

def isCollect(array):
    if makeStack(array):
        return False
    return True

def makeinitDeque(s):
    array = []
    for char in s:
        array.append(char)
    return deque(array)
    
def solution(s):
    answer = 0
    array = makeinitDeque(s)
    
    for _ in range(len(array)):
        if isCollect(array):
            answer += 1
        array.append(array.popleft())
    return answer