def solution(t, p):
    answer = 0
    
    for i in range(len(t)):
        target = t[i:len(p) + i]
        if len(target) != len(p):
            continue
        else:
            if int(target) <= int(p):
                answer += 1
    return answer