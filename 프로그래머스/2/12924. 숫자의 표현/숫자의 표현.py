def solution(n):
    answer = 1
    
    for current in range(1, n):
        total = 0
        for num in range(current, n + 1):
            if total < n:
                total += num
            elif total >= n:
                if total == n:
                    answer += 1
                break
    return answer