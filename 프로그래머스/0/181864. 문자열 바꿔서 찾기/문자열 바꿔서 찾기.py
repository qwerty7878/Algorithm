def solution(myString, pat):
    answer = 0
    temp = ''
    for i in myString:
        if i == 'A':
            i = 'B'
        else:
            i = 'A'
        temp += i
    
    print(temp)
    if pat in temp:
        answer = 1
    else:
        answer = 0
    return answer