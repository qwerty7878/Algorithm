from collections import deque

def solution(s):
    answer = 0
    dq = deque(s)
    for i in s:
        temp = []
        iscollect = True
        for char in dq:
            if char == '(' or char == '[' or char == '{':
                temp.append(char)
            else:
                if temp and (temp[-1] == '{' or temp[-1] == '(' or temp[-1] == '['):
                    if temp[-1] == '{' and char == '}':
                        temp.pop()
                    elif temp[-1] == '(' and char == ')':
                        temp.pop()
                    elif temp[-1] == '[' and char == ']':
                        temp.pop()
                else:
                    iscollect = False
                    break

        if len(temp) != 0:
            iscollect = False

        if iscollect:
            answer += 1
            
        dq.append(dq.popleft())
    return answer