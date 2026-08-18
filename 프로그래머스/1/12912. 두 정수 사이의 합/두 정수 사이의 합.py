def solution(a, b):
    answer = 0
    for idx in range(min(a, b), max(a, b) + 1):
        answer += idx
    return answer