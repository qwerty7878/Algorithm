def solution(arr, queries):
    answer = []
    
    for query in queries:
        temp = []
        for idx in range(query[0], query[1] + 1):
            temp.append(arr[idx])
            
        temp.sort()
        for num in temp:
            if num > query[2]:
                answer.append(num)
                break
            elif num == temp[-1] and num <= query[2]:
                answer.append(-1)
    return answer