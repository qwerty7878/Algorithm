def solution(s):
    answer = ''
    numList = list(map(int, s.split(' ')))
    numList.sort()
    answer += f"{numList[0]} {numList[-1]}"
    return answer