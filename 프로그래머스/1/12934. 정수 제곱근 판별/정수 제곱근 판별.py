import math

def solution(n):
    answer = 0
    if int(math.sqrt(n)) ** 2 == n:
        answer = int(math.sqrt(n) + 1) ** 2
    else:
        answer = -1
    return answer