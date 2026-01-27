def solution(arr):
    answer = []
    for num in arr:
#         이전의 수인지 아닌지 판별하려면 temp 존재해야함
        if not answer:
            answer.append(num)
        elif answer[-1] != num:
            answer.append(num)
    return answer