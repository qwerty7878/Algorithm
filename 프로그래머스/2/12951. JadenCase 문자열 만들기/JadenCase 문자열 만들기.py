def solution(s):
    answer = ''
    for i in s:
        if len(answer) != 0:
            if answer[-1] == ' ' and i != ' ':
                i = i.upper()
            else:
                i = i.lower()
        else:
            if i.isalpha():
                i = i.upper()
        answer += i
        # print(answer)
    return answer