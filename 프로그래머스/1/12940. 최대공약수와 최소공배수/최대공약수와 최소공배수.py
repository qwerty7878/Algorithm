import math

def solution(n, m):
    answer = []
    gcd = math.gcd(n, m)
    print(gcd)
    lcm = n * m // gcd
    print(lcm)
    answer.append(gcd)
    answer.append(lcm)
    return answer