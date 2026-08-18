def solution(s):
    answer = ''
    array = sorted(map(int, s.split()))
    # print(array)
    answer += str(array[0]) + ' ' + str(array[-1])
    return answer