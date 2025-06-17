def solution(numbers):
    answer = -1
    sum = 0
    for i in range(0,10):
        if i not in numbers:
            sum += i
    answer = sum
    return answer