def solution(x):
    answer = True
    
    divnum = 0
    for num in str(x):
        divnum += int(num)
        
    if x % divnum != 0:
        answer = False
    return answer