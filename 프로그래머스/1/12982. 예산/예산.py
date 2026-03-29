def solution(d, budget):
    answer = 0
    d.sort()
    while True:
        if sum(d) <= budget:
            answer = len(d)
            break
        else:
            d.pop()
    return answer