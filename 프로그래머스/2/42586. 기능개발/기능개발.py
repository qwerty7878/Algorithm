import math

def solution(progresses, speeds):
    answer = []
    
    day = 0
    count = 0
    for idx in range(len(progresses)):
        duration = 0
        if (100 - progresses[idx]) % speeds[idx] == 0:
            duration = (100 - progresses[idx]) // speeds[idx]
        else:
            duration = (100 - progresses[idx]) // speeds[idx] + 1
        # print(duration)
        if day >= duration:
            count += 1
        else:
            day = duration
            if count != 0:
                answer.append(count)
            count = 1
    answer.append(count)
    return answer