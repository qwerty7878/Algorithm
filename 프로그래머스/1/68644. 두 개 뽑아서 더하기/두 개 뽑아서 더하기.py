def solution(numbers):
    answer = []
    for i in range(len(numbers)):
        for j in range(len(numbers)):
            if i < j:
                sum = numbers[i] + numbers[j]
                if sum not in answer:
                    answer.append(sum)
    answer.sort()
    return answer