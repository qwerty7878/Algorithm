def solution(sizes):
    answer = 0
    
    max_w = -1
    max_h = -1
    for i in sizes:
        if i[0] < i[1]:
            temp = i[1]
            i[1] = i[0]
            i[0] = temp
        
        if i[0] >= max_w:
            max_w = i[0]
        if i[1] >= max_h:
            max_h = i[1]
            
    answer = max_h * max_w
    return answer