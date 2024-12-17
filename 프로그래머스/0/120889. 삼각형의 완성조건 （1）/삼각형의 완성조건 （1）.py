def solution(sides):
    sides.sort()
    answer = 1
    if(sides[2] < sides[0] + sides[1]):
        return answer
    else:
        return 2