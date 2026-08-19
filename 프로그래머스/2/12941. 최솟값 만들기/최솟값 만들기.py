def solution(A,B):
    answer = 0
    sort_a = sorted(A)
    sort_b = sorted(B, reverse=True)
    
    for idx in range(len(sort_a)):
        answer += (sort_a[idx] * sort_b[idx])
    return answer