def solution(num, k):
    answer = str(num)
    if answer.find(str(k)) != -1:
        return answer.find(str(k)) + 1
    else:
        return answer.find(str(k))