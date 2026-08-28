def divnumArray(n):
    array = []
    for num in range(1, n + 1):
        if n % num == 0:
            array.append(num)
    return array
            
def solution(n):
    return sum(divnumArray(n))