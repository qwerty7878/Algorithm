def solution(num_list, n):
    answer = []
    for idx in range(len(num_list)):
        if n - 1 >= idx:
            answer.append(num_list[idx])
    return answer