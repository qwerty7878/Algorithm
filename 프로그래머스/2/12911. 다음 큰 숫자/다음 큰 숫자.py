def solution(n):
    answer = 0
    
    num = n + 1
    target = bin(n)[2:].count('1')

    while True:
        if bin(num)[2:].count('1') == target:
            answer = num
            break
        else:
            num += 1
    return answer