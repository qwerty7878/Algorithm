def solution(arr):
    answer = []
    temp = arr[0]
    answer.append(arr[0])
    for i in range(1, len(arr)):
        if temp == arr[i]:
            continue
        else:
            answer.append(arr[i])
        temp = arr[i]
    return answer