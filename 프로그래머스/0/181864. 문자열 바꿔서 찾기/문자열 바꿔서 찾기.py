def solution(myString, pat):
    myString = myString.replace('A','@')
    myString = myString.replace('B','A')
    myString = myString.replace('@','B')
    
    if pat in myString:
        return 1
    else:
        return 0