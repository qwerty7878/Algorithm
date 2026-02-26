def solution(s):
    answer = -1
    st = list(s)
    # print(st)
    temp = []
    
    for char in st:
        if not temp:
            temp.append(char)
        elif temp and temp[-1] == char:
            temp.pop()
        else:
            temp.append(char)
            
    if not temp:
        answer = 1
    else:
        answer = 0
    return answer