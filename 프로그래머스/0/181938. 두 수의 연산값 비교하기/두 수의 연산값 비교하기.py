def solution(a, b):
    aPb = int(str(a) + str(b))
    ab = 2 * a * b
    answer = max(aPb, ab)
    return answer