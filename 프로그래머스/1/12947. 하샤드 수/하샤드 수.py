def solution(x):
    answer = True
    hashad = 0
    for num in str(x):
        hashad += int(num)

    if x % hashad == 0:
        answer = True
    else:
        answer = False
    return answer