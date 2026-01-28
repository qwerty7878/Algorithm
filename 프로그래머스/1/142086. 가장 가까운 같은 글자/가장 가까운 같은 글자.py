def solution(s):
    answer = []
    temp = []
    
    for char in s:
        if char not in temp:
            answer.append(-1)
        else:
            idx = 1
            while True:
                if temp[-idx] == char:
                    break
                else:
                    idx += 1
            answer.append(idx)
        temp.append(char)
    return answer