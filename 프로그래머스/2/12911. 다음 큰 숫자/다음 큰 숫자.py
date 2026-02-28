def solution(n):
    answer = n + 1
    origin = str(bin(n)[2:])
    while True:
        target = str(bin(answer)[2:])
        if origin.count('1') == target.count('1'):
            break
        else:
            answer += 1
    return answer