def solution(x):
    answer = False
    div = 0
    for i in str(x):
        div += int(i)
    if x % div == 0:
        answer = True
    return answer