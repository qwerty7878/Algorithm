def solution(s):
    answer = -1
    temp = []
    for char in s:
        if not temp:
            temp.append(char)
        else:
            if temp[-1] == char:
                temp.pop()
            else:
                temp.append(char)
                
    if not temp:
        answer = 1
    else:
        answer = 0
    return answer