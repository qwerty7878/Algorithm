def solution(arr):
    answer = [i for i in arr]
    answer.remove(min(arr))
    if not answer:
        answer.append(-1)
    return answer