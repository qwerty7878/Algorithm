import math

def solution(n, m):
    num1 = math.gcd(n,m)
    num2 = n * m // num1
    return [num1,num2]