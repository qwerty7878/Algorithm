def solution(arr):   
    if len(arr) == 1:
        return [-1]
    answer = arr
    answer.remove(min(arr))
    return answer