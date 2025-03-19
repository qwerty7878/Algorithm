def solution(str1, str2):
    answer = ''
    for i in range(0,len(str1 + str2)):
        if len(answer) % 2 == 0:
            answer += str1[i//2]
        else:
            answer += str2[i//2]
    return answer