def solution(d, budget):
    d.sort()
    while True:
        if sum(d) <= budget:
            break
        else:
            d.pop()
    return len(d)