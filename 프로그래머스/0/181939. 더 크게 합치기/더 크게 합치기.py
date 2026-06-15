def solution(a, b):
    answer = max(int(str(max(a, b)) + str(min(a, b))), int(str(min(a, b)) + str(max(a, b))))
    return answer