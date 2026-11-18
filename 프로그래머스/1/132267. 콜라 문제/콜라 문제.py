def solution(a, b, n):
    answer = 0
    
    while True:
        answer += (n // a) * b
        n = (n // a) * b + (n % a)
        # print(answer, n)
        if n < a:
            break
    return answer