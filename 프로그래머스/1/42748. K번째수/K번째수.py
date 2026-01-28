def solution(array, commands):
    answer = []
    
    for command in commands:
        start = command[0]
        end = command[1]
        target = command[2]
        
        temp = []
        for num in range(start - 1, end):
            temp.append(array[num])
        temp.sort()
        answer.append(temp[target - 1])
    return answer