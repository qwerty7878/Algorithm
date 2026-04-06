def solution(food):
    answer = ''
    food.remove(food[0])
    
    half = ''
    for idx in range(len(food)):
        mode = food[idx] // 2
        if mode >= 1:
            half += str(idx + 1) * mode
        # print(half)
    
    answer = half + '0' + half[::-1]
    return answer