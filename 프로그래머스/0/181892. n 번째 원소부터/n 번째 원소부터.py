def solution(num_list, n):
    answer = []
    for idx in range(n - 1, len(num_list)):
        answer.append(num_list[idx])
    return answer