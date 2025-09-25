def solution(n):
    answer = 0

    for i in range(1, n + 1):
        sum = 0
        num = i
        while True:
            
            if sum == n:
                answer += 1
            
            if sum >= n:
                break
            
            sum += num
            num += 1
    return answer