def solution(num_list):
    answer = 0
    isMinus = False
    for idx in range(len(num_list)):
        if num_list[idx] < 0:
            isMinus = True
            answer = idx
            break
    if isMinus == False:
        answer = -1
    return answer