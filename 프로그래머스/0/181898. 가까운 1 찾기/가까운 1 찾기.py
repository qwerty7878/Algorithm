def solution(arr, idx):
    answer = -1
    for i in range(len(arr)):
        if i >= idx and arr[i] == 1:
            answer = i
            break
        else:
            continue
    return answer