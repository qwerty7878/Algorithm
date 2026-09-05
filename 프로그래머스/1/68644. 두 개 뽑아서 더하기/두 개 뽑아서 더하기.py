from itertools import combinations

def solution(numbers):
    answer = []
    
    for combi in combinations(numbers, 2):
        if sum(combi) not in answer:
            answer.append(sum(combi))
    
    return sorted(answer)