from itertools import combinations

def solution(nums):
    answer = 0
    
    for combi in combinations(nums, 3):
        # print(combi)
        primenum = sum(combi)
        isPrime = True
        
        for mod in range(2, int(primenum ** 0.5) + 1):
            if primenum % mod == 0:
                isPrime = False
                break
        if isPrime:
            answer += 1
        
    return answer