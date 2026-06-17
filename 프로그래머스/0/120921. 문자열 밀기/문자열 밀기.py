from collections import deque

def solution(A, B):
    answer = -1
    Adeque = deque(A)
    # print(Adeque)
    if A == B:
        return 0
    
    for count in range(len(Adeque)):
        Adeque.appendleft(Adeque.pop())
        # print(Adeque)
        
        rotate_A = ''.join(Adeque)
        # print(rotate_A)
        
        if rotate_A == B:
            answer = (count + 1)
            break
    return answer