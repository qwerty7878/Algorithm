def solution(num_list):
    answer = 0
    multiple = 1
    sumpow = sum(num_list) ** 2
    for num in num_list:
        multiple *= num
    
    if multiple > sumpow:
        answer = 0
    else:
        answer = 1
    return answer