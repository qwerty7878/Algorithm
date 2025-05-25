def solution(numbers):
    answer = []
    
    for i in range(0, len(numbers)):
        sum = 0
        for j in range(i + 1, len(numbers)):
            answer.append(numbers[i] + numbers[j])
            
    answer = sorted(set(answer))
    return answer