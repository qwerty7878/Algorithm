def solution(angle):
    answer = 0
    if angle == 90:
        answer = 2
    elif 0 <= angle < 90:
        answer = 1
    elif 91 <= angle < 180:
        answer = 3
    else:
        answer = 4
    return answer