def solution(myString, pat):
    answer = 0
    myString = myString.replace('A','b')
    myString = myString.replace('B','a')
    
    pat = pat.replace('A','a')
    pat = pat.replace('B','b')

    if pat in myString:
        answer = 1
    return answer