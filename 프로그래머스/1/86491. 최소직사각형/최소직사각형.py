def solution(sizes):
    max0 = -1
    max1 = -1
    
    for i in sizes:
        if i[0] < i[1]:
            temp = i[0]
            i[0] = i[1]
            i[1] = temp
    
        if i[0] >= max0:
            max0 = i[0]
            
        if i[1] >= max1:
            max1 = i[1]
            
    return max1 * max0