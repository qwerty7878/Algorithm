def solution(arr, k):
    answer = []
    
    if k % 2 == 0:
        for number in arr:
            answer.append(number + k)
    else:
        for number in arr:
            answer.append(number * k)
    
    return answer