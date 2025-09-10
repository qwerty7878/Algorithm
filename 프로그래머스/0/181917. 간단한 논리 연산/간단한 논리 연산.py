def solution(x1, x2, x3, x4):
    answer = True
    if x1 == False and x2 == True and  x3 == True and x4 == True:
        answer = True
    elif x1 == True and x2 == False and  x3 == True and x4 == True:
        answer = True
    elif x1 == True and x2 == True and  x3 == False and x4 == True:
        answer = True
    elif x1 == True and x2 == True and  x3 == True and x4 == True:
        answer = True
    elif x1 == True and x2 == True and  x3 == True and x4 == False:
        answer = True
    elif x1 == False and x2 == True and  x3 == False and x4 == True:
        answer = True
    elif x1 == False and x2 == True and  x3 == True and x4 == False:
        answer = True
    elif x1 == True and x2 == False and  x3 == False and x4 == True:
        answer = True
    elif x1 == True and x2 == False and  x3 == True and x4 == False:
        answer = True
    else:
        answer = False
    return answer