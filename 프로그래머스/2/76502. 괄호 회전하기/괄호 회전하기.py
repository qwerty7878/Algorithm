from collections import deque

def solution(s):
    answer = 0

    s_list = deque(s)
    for _ in range(len(s)):
        temp = []
        isDone = True
        for char in s_list:
            if char == '[' or char == '(' or char == '{':
                temp.append(char)
            else:
                if not temp and (char == ']' or char == ')' or char == '}'):
                    isDone = False
                    break
                elif temp:
                    if char == ']' and temp[-1] == '[':
                        temp.pop()
                    elif char == '}' and temp[-1] == '{':
                        temp.pop()
                    elif char == ')' and temp[-1] == '(':
                        temp.pop()
                    else:
                        isDone = False
                        break
        if isDone and not temp:
            answer += 1

        s_list.appendleft(s_list.pop())
    return answer