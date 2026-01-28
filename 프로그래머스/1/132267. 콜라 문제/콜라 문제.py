def solution(a, b, n):
    answer = 0
    rest = 0
    while True:
        if n < a:
            break
        
        if n % a == 0:
            answer += (n // a) * b
        else:
            answer += (n // a) * b
            rest = n % a
        n //= a
        n *= b
        if rest != 0:
            n += rest
            rest = 0
    return answer