def solution(num_list):
    answer = 1
    
    gop = 1
    for num in num_list:
        gop *= num
        
    if sum(num_list) ** 2 < gop:
        answer = 0
    return answer