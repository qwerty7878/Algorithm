def solution(arr):
    answer = []
    for num in arr:
#         비어있는 경우 초기 값 저장(처음에만 실행)
        if not answer:
            answer.append(num)
        elif answer[-1] != num:
            answer.append(num)
    return answer