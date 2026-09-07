def gcm(a, b):
    if b == 0:
        return a
    return gcm(b, a % b)

def lcm(a, b):
    return (a * b) // gcm(a, b)

def solution(arr):
    answer = arr[0]
    for idx in range(1, len(arr)):
        answer = lcm(answer, arr[idx])
    return answer