def solution(n):
    answer = 0
    
    temp = ''
    while n > 0:
        temp += str(n % 3)
        n //= 3
    
    # print(temp)
    answer = int(temp, 3)
    return answer