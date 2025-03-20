def solution(my_string, s, e):
    answer = list(my_string)
    answer[s:e + 1] = reversed(answer[s:e + 1])
    return ''.join(answer)

    # return my_string[:s] + my_string[s:e + 1][::-1] + my_string[e + 1:]