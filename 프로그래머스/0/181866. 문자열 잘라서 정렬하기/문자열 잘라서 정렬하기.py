def solution(myString):
    temp = myString.split('x')
    temp.sort()
    answer = []
    for i in temp:
        if i != '':
            answer.append(i)
    return answer