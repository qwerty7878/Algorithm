from collections import deque

def solution(progresses, speeds):
    answer = []

    fin = []
    for idx in range(len(speeds)):
        if (100 - progresses[idx]) % speeds[idx] != 0:
            fin.append((100 - progresses[idx]) // speeds[idx] + 1)
        else:
            fin.append((100 - progresses[idx]) // speeds[idx])

    dq = deque(fin)

    while dq:
        day = dq.popleft()
        cnt = 1
        
        while dq:
            if dq[0] > day:
                break
            dq.popleft()
            cnt += 1
        answer.append(cnt)
        
    return answer