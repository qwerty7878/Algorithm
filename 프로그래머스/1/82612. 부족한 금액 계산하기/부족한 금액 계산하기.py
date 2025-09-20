def solution(price, money, count):
    answer = -1
    temp = 0
    for i in range(1, count + 1):
        temp += i * price
    print(temp)
    if temp - money > 0:
        answer = temp - money
    else:
        answer = 0
    return answer