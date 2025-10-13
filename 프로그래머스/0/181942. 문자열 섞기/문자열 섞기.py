def solution(str1, str2):
    answer = ''
    for word in range(len(str1)):
        answer += str1[word] + str2[word]
    return answer