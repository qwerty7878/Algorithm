def solution(number, limit, power):
    answer = 0
    
    for n in range(1, number + 1):
        temp = 0
        for i in range(1, int(n ** 0.5) + 1):
            if n % i == 0:
                if i * i == n:
                    temp += 1
                else:
                    temp += 2
                
        if temp > limit:
            answer += power
        else:
            answer += temp
    return answer