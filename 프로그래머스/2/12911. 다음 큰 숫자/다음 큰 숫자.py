def solution(n):
    answer = 0
    
    num = str(bin(n)[2:]).count('1')
    print(num)
    
    bigger = n + 1
    while True:
        if num == str(bin(bigger)[2:]).count('1'):
            answer = bigger
            break
        else:
            bigger += 1
    return answer