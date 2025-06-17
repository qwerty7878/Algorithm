def solution(arr):
    answer = []
    for i in arr:
        answer.append(i)
    answer.remove(min(arr))
    # print(answer)
    
    if len(answer) == 0:
        answer.append(-1)
    # print(answer)
    return answer
