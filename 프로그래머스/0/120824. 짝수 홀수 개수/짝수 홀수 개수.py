def solution(num_list):
    even = 0
    for i in num_list:
        if(i % 2 == 0):
            even += 1
    answer = [even, len(num_list) - even]
    return answer