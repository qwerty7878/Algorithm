def solution(my_string, overwrite_string, s):
    answer = ''
    answer += my_string[:s]
    print(answer)
    answer += overwrite_string
    print(answer)
    if (len(overwrite_string) + s) - len(my_string) < 0:
        answer += my_string[(len(overwrite_string) + s):]
    print(answer)
    return answer