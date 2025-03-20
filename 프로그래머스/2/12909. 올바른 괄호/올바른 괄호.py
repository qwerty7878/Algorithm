from collections import deque

def solution(s):
    
    st = deque()
    for i in s:
        if i == '(':
            st.append(i)
        elif i == ')' and len(st) != 0:
            st.pop()
        elif i == ')' and len(st) == 0:
            return False
            break
        
            
    if len(st) == 0:
        return True
    else:
        return False
