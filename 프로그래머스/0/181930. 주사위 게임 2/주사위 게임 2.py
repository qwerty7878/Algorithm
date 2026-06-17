def solution(a, b, c):
    answer = 0
    dice = {a, b, c}
    print(dice)
    if len(dice) == 3:
        answer = a + b + c
    elif len(dice) == 1:
        answer = (a * 3) * (a ** 2 * 3) * (a ** 3 * 3)
    else:
        answer = (a + b + c) * (a ** 2 + b ** 2 + c ** 2)
    return answer