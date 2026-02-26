def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return (a * b) // gcd(a, b)

def solution(arr):
    answer = lcm(arr[0], arr[1])
    for idx in range(2, len(arr)):
        answer = lcm(answer, arr[idx])
    return answer