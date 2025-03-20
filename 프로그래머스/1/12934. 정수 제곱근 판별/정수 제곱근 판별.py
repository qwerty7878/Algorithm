import math

def solution(n):
    answer = 0
    if int(math.sqrt(n)) ** 2 == n:
        return (math.sqrt(n) + 1) ** 2
    else:
        return -1