def solution(price, money, count):
    answer = -1

    total = 0
    for i in range(1, count + 1):
        total += price * i
    # print(total)
    total -= money
    
    if total > 0:
        answer = total
    else:
        answer = 0
        
    return answer