import math

def solution(n, m):
    answer = []
    answer.append(math.gcd(n,m))
    answer.append(lcm(n,m))
    return answer

def lcm(n,m):
    return n * m // math.gcd(n,m)