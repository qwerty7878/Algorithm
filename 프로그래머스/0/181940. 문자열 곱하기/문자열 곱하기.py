def solution(my_string, k):
    answer = ''
    for i in range(k):
        for j in my_string:
            answer += j
    return answer