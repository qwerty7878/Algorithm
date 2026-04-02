def solution(n):
    answer = 0
    
    for num in range(1, n + 1):
        cnt = 0
        for div in range(1, num + 1):
            if num % div == 0:
                cnt += 1
                
            if cnt >= 3:
                answer += 1
                break
    return answer