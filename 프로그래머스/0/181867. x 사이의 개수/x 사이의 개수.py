def solution(myString):
    list = myString.split('x')
    answer = []
    for i in list:
        answer.append(len(i))
    return answer