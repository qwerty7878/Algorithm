import math

def solution(n):
    answer = 0
    next = 0
    if n == int(math.sqrt(n)) ** 2:
        next = (int(math.sqrt(n)) + 1) ** 2
        answer = next
    else:
        answer = -1
    return answer