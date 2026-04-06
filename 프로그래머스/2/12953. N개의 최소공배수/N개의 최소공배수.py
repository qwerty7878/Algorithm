def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def lcm(a, b):
    return (a * b) // gcd(a, b)

def solution(arr):
    answer = 0
    temp = lcm(arr[0], arr[1])
    for i in range(2, len(arr)):
        temp = lcm(temp, arr[i])
    answer = temp
    
    return answer