def solution(s):
    answer = []
    
    temp = []
    for char in s:
        if char not in temp:
            temp.append(char)
            answer.append(-1)
        else:
            for idx in range(len(temp)):
                if temp[-(idx + 1)] == char:
                    answer.append(idx + 1)
                    temp.append(char)
                    break
    # print(temp)
    return answer