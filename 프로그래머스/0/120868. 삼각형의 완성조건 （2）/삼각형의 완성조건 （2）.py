def solution(sides):
    answer = 0
    sides.sort()
#     배열 안에 수가 가장 긴 변이 없는 경우
    for _ in range(sides[1] + 1, sum(sides)):
        answer += 1
#     배열 안에 수가 가장 긴 변이 있는 경우
    for _ in range(sides[1] - sides[0] + 1, sides[1] + 1):
        answer += 1
    return answer