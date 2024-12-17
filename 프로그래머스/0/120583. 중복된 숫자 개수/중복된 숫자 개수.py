def solution(array, n):
    answer = 0
    for i in array:
        if n in array:
            answer = array.count(n)
    return answer