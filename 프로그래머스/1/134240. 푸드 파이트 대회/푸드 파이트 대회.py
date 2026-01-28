def solution(food):
    answer = ''
    temp = ''
    for i in range(1, len(food)):
        if food[i] // 2 > 0:
            temp +=  str(i) * (food[i] // 2)
    reverseTemp = temp[::-1]
    answer += temp + '0' + reverseTemp
    return answer