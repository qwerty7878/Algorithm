from itertools import combinations

def solution(number):
    answer = 0
    
    for combi in combinations(number, 3):
        # print(combi)
        if sum(combi) == 0:
            # print(combi)
            answer += 1
    return answer