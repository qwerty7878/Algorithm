from itertools import combinations

def solution(nums):
    answer = 0
    for combi in combinations(nums, 3):
        temp = 0
        # print(combi)
        for num in combi:
            temp += num
        # print(temp)
        isPrime = True
        for i in range(2, int(temp ** 0.5) + 1):
            if temp % i == 0:
                isPrime = False
                break
        if isPrime:
            answer += 1
    return answer