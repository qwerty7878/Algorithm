def solution(n):
    arr = [0] * (n + 1)
    
    arr[1] = 1
    arr[0] = 0
    
    for i in range(2,n + 1):
        arr[i] = arr[i - 2] + arr[i - 1]
    return arr[n] % 1234567