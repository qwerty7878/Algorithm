def solution(number, limit, power):
    temp = []
    
    for num in range(1, number + 1):
        count = 0
        for i in range(1, int(num ** 0.5) + 1):
            if num % i == 0:
                if i * i == num:
                    count += 1
                else:
                    count += 2
                
        if count > limit:
            temp.append(power)
        else:
            temp.append(count)
    return sum(temp)