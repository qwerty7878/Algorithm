def solution(absolutes, signs):
    answer = 123456789
    sum = 0
    for i in range(len(absolutes)):
        if signs[i] == True:
            sum += absolutes[i]
        else:
            sum -= absolutes[i]
    answer = sum
    return answer