def solution(my_string, is_suffix):
    answer = 1
    if not my_string.endswith(is_suffix):
        answer = 0
    return answer