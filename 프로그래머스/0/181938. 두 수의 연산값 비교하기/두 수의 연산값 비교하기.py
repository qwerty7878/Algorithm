def solution(a, b):
    answer = 0
    
    ab2 = 2 * a * b
    ab = int(str(a) + str(b))
    
    if ab2 < ab:
        answer = ab
    else:
        answer = ab2
    return answer