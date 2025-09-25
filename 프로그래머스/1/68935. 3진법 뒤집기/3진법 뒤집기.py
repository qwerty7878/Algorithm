def solution(n):
    answer = 0
    temp = []
    while True:
        if n < 3:
            temp.append(n)
            break
        temp.append(n % 3)
        n //= 3

    temp.reverse()
    for i in range(len(temp)):
        answer += (3 ** i) * temp[i]
    return answer