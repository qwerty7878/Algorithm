def solution(my_string, overwrite_string, s):
    answer = ''
    answer += my_string[:s]
    print(answer)
    answer += overwrite_string
    print(answer)
    answer += my_string[s + len(overwrite_string):]
    print(answer)
    return answer