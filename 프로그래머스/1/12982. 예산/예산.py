def solution(d, budget):
    answer = 0
    d.sort()
    idx = 0
    while idx != len(d):
        budget -= d[idx]
        
        if budget < 0:
            break
            
        idx += 1
        answer += 1
    return answer