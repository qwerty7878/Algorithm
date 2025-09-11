def solution(numLog):
    answer = ''
    temp = numLog[0]
    for i in range(1, len(numLog)):
        if numLog[i] - temp == 1:
            answer += 'w'
        elif numLog[i] - temp == -1:
            answer += 's'
        elif numLog[i] - temp == 10:
            answer += 'd'
        elif numLog[i] - temp == -10:
            answer += 'a'
        temp = numLog[i]
    return answer