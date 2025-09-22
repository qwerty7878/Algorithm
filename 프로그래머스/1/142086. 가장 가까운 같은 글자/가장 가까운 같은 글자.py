def solution(s):
    answer = []
    temp = []
    for i in range(len(s)):
        if s[i] not in temp:
            answer.append(-1)
        elif s[i] in temp:
            for j in range(1, len(temp) + 1):
                if temp[-j] == s[i]:
                    answer.append(j)
                    break
        temp.append(s[i])
    return answer