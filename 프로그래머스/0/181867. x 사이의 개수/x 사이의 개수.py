def solution(myString):
    answer = []
    array = myString.split('x')
    for char in array:
        answer.append(len(char))
    return answer