import math

def solution(n):
    answer = -1
    if int(math.sqrt(n)) ** 2 == n:
        answer = (math.sqrt(n) + 1) ** 2
    return answer