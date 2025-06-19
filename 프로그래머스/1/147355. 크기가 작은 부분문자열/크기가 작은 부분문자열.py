def solution(t, p):
    answer = 0
    arr = []
    for i in range(0, len(t) - len(p) + 1):
        arr.append(t[i:len(p) + i])
    # print(arr)

    count = 0
    for i in arr:
        if i <= p:
            count += 1
    answer = count
    
    return answer