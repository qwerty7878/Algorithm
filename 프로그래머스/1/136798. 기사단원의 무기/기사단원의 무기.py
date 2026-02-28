def solution(number, limit, power):
    answer = 0
    
    arr = []
    for num in range(1, number + 1):
        count = 0
        for div in range(1, int(num ** 0.5) + 1):
            if num % div == 0:
                count += 1
                if div != num // div:
                    count += 1
        arr.append(count)
    # print(arr)
    
    for idx in range(len(arr)):
        if arr[idx] > limit:
            arr[idx] = power
        answer += arr[idx]
    return answer