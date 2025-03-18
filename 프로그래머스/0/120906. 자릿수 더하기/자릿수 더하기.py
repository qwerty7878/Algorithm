def solution(n):
    answer = 0
    while True:
        if n >= 10:
            answer += n % 10
            n = n // 10
        else:
            answer += n
            break
    return answer