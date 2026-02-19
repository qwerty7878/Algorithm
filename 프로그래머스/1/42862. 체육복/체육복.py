def solution(n, lost, reserve):
    answer = 0

    set_lost = set(lost)
    set_reserve = set(reserve)
#     준비성이 철저해서 잃어버릴거 대비해서 2개 챙겨온 사람
    myown = set_lost.intersection(set_reserve)
    
    set_lost -= myown
    set_reserve -= myown
    
    for lo in sorted(set_lost):
        plus = lo + 1
        minus = lo - 1
        
        if minus in set_reserve:
            set_reserve.remove(minus)
            set_lost.remove(lo)
        elif plus in set_reserve:
            set_reserve.remove(plus)
            set_lost.remove(lo)
            
    answer = n - len(set_lost)
    return answer