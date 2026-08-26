def solution(array, commands):
    answer = []
    
    for command in commands:
        target_list = array[command[0] - 1:command[1]]
        target_num = sorted(target_list)[command[2] - 1]
        answer.append(target_num)
    return answer