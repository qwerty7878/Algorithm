def solution(num_list):
    answer = 0
    odd = 0
    even = 0
    for idx in range(len(num_list)):
        if idx % 2 == 0:
            odd += num_list[idx]
        else:
            even += num_list[idx]
    answer = max(even,odd)
    return answer