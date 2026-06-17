def solution(a, d, included):
    hap = included.count(True) * a
    for idx in range(1, len(included)):
        num = (idx * d)
        if included[idx] == True:
            hap += num
        
    return hap