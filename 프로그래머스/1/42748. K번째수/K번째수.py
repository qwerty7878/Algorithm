def solution(array, commands):
    answer = []
    
    for command in commands:
        start, end, target = command[0], command[1], command[2]
        temp = []
        for idx in range(start - 1, end):
            temp.append(array[idx])
        # print(temp)
        temp.sort()
        answer.append(temp[target - 1])
    return answer