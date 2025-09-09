def solution(arr):
    stk = []
    i = 0
    while len(arr) > i:
        # 만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
        if len(stk) == 0:
            stk.append(arr[i])
            i += 1
        # stk에 원소가 있고   
        else:
            # stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
            if stk[-1] < arr[i]:
                stk.append(arr[i])
                i += 1
            else:
                stk.pop()
    return stk