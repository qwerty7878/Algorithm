def solution(array, commands):
    answer = []
    
    for command in commands:
        start = command[0]
        end = command[1]
        target = command[2]
        
        temp = []
        for idx in range(start, end + 1):
            temp.append(array[idx - 1])
        # print(temp)
        li = sorted(temp)
        answer.append(li[target - 1])
    return answer