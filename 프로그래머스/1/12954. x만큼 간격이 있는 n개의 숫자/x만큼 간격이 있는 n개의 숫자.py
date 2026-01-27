def solution(x, n):
    answer = []
    for idx in range(1, n + 1):
        answer.append(x * idx)
    return answer