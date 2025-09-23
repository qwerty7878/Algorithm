def solution(s):
    answer = []
    arr = s.split(' ')
    for i in arr:
        temp = ""
        for j in range(len(i)):
            if j % 2 == 0:
                temp += i[j].upper()
            else:
                temp += i[j].lower()
        answer.append(temp)
    return ' '.join(answer)