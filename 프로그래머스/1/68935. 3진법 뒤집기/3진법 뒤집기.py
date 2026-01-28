def solution(n):
    answer = 0
    temp = []
    
    while True:
        if n < 3:
            temp.append(n)
            break
        if n % 3 == 0:
            temp.append(0)
        elif n % 3 != 0:
            temp.append(n % 3)
        n //= 3
    
    print(*temp)
    
    return answer