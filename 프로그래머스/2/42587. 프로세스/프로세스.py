from collections import deque

def solution(priorities, location):
    answer = 0
    isTarget = [0] * len(priorities)
    isTarget[location] = 1

    priorities = deque(priorities)
    isTarget = deque(isTarget)
    # print(isTarget)

    while priorities:
        if max(priorities) == priorities[0]:
            priorities.popleft()
            target = isTarget.popleft()
            answer += 1
            
            if target == 1:
                break
        else:
            priorities.append(priorities.popleft())
            isTarget.append(isTarget.popleft())
        
    return answer