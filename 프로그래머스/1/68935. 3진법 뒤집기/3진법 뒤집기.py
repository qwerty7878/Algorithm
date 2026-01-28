def solution(n):
    answer = 0
    temp = []
    
    while True:
        if n < 3:
            temp.append(str(n))
            break
        if n % 3 == 0:
            temp.append("0")
        elif n % 3 != 0:
            temp.append(str(n % 3))
        n //= 3
    
    three = ''.join(temp)
    
    index = 0
    for num in three[::-1]:
        answer += (3 ** index) * int(num)
        index += 1
    
    return answer