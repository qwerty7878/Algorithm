def solution(a, b):
    answer = 0
    biggerA = str(a) + str(b)
    biggerB = str(b) + str(a)
    
    if int(biggerA) > int(biggerB):
        answer = int(biggerA)
    else:
        answer = int(biggerB)
    return answer