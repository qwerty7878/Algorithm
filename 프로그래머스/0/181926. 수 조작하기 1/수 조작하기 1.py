def solution(n, control):
    answer = 0
    for char in control:
        if char == 'w':
            n += 1
        elif char == 's':
            n -= 1
        elif char == 'd':
            n += 10
        elif char == 'a':
            n -= 10
    answer = n
    return answer