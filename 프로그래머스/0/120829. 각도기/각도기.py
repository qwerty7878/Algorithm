def solution(angle):
    if angle < 90 and angle > 0:
        return 1
    elif angle == 90:
        return 2
    elif angle > 90 and angle < 180:
        return 3
    else:
        return 4