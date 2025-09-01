def solution(l, r):
    answer = []
    for i in range(l,r + 1):
        if i % 5 == 0 and set(str(i)) <= {'0', '5'}:
            answer.append(i)
            
    if len(answer) == 0:
        answer.append(-1)
    return answer