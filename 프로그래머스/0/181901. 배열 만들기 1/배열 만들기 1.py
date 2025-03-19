def solution(n, k):
    answer = []
    for i in range(1, n + 1):
        if n >= (k * i):
            answer.append(k * i)
    return answer