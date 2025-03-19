def solution(num_list):
    idx = 0
    for i in num_list:
        if i < 0:
            idx = i
            break
    
    if idx != 0:
        return num_list.index(idx)
    else:
        return -1