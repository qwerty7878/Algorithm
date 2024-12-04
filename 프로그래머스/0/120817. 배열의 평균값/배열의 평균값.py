def solution(numbers):
    # return sum(numbers) / len(numbers)
    
    answer = 0
    for i in numbers:
        answer += i
    return answer / len(numbers)