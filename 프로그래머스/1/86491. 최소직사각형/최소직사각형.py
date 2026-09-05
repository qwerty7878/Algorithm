def solution(sizes):
    
    max_w = 0
    max_h = 0
    for size in sizes:
        w = max(size[0], size[1])
        h = min(size[0], size[1])
        
        if w > max_w:
            max_w = w
        if h > max_h:
            max_h = h
    return max_h * max_w