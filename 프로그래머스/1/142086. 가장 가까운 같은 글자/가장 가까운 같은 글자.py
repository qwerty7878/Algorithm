def solution(s):
    answer = []
    
    temp = []
    for char in s:
        if char not in temp:
            answer.append(-1)
            temp.append(char)
        else:
            idx = 1
            while True:
                if char == temp[-idx]:
                    answer.append(idx)
                    break
                else:
                    idx += 1
            temp.append(char)
    return answer