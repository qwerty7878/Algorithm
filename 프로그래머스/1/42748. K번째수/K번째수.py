def solution(array, commands):
    answer = []
    
    for i in commands:
        start = i[0]
        end = i[1]
        choice = i[2]
        temp = []
        for j in range(start - 1, end):
            temp.append(array[j])
        temp.sort()
        answer.append(temp[choice - 1])
    return answer