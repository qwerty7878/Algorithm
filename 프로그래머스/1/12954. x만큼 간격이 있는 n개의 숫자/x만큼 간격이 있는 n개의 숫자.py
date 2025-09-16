def solution(x, n):
    answer = []
    cnt = 1
    while True:
        if cnt == n + 1:
            break
        answer.append(x * cnt)
        cnt += 1
    return answer