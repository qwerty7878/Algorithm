def solution(myString):
    answer = ''
    for i in myString:
        if i in '[a,b,c,d,e,f,g,h,i,j,k]':
            i = 'l'
        answer += i
    return answer