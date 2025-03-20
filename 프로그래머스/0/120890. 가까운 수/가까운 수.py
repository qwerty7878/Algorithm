def solution(array, n):
    answer = 0
    gap = 10000
    array.sort()
    for i in array:
        if abs(i - n) < gap:
            gap = abs(i - n)
            answer = i
        if abs(i - n) == gap:
            continue
    return answer