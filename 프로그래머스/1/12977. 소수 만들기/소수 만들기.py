from itertools import combinations

def solution(nums):
    answer = 0

    for combi in combinations(nums, 3):
        prime = sum(combi)
        for i in range(2, int(prime ** 0.5) + 1):
            if prime % i == 0:
                break
        else:
            answer += 1    
    return answer