def solution(food):
    answer = ''
    
    base = ''
    for idx in range(len(food)):
        if food[idx] < 2:
            continue
        else:
            rep = food[idx] // 2
            base += str(idx) * rep
            
    answer = base + '0' + base[::-1]
    
    return answer