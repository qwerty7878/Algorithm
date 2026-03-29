def solution(n):
    answer = 0
    
    for cur in range(1, n + 1):
        sum = 0
        for num in range(cur, n + 1):
            sum += num
            if sum == n:
                answer += 1
                break
            else:
                if sum > n:
                    break
    return answer