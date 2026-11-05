def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * b // gcd(a, b)

def solution(n, m):
    answer = [gcd(n, m), lcm(n, m)]
    return answer