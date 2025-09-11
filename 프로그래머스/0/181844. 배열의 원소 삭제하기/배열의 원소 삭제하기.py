def solution(arr, delete_list):
    answer = []
    for i in range(len(arr)):
        target = arr[i]
        if target in delete_list:
            continue
        else:
            answer.append(target)
    return answer