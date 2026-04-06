def solution(a, b, n):
    answer = 0

    while True:
        answer += (n // a) * b
        # print(answer)
        rest = n % a
        new = (n // a) * b
        n = new + rest
        if n < a:
            break
            
    return answer