def solution(my_strings, parts):
    answer = ''
    for i in range(len(parts)):
        temp = my_strings[i]
        print(temp)
        s = parts[i][0]
        print(s)
        e = parts[i][1]
        print(e)
        answer += temp[s:e + 1]
    return answer