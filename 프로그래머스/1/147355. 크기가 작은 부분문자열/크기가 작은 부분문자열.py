def solution(t, p):
    answer = 0
    for i in range(len(t)):
        target = t[i:i + len(p)]
        # print(target)
        if target <= p and len(p) == len(target):
            answer += 1
    return answer