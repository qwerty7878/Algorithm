def solution(n):
    answer = 0
    
    nums = []
    while True:
        if n < 3:
            nums.append(n)
            break
        
        if n % 3 == 0:
            nums.append(0)
        else:
            nums.append(n % 3)
        n //= 3
    rev_nums = nums[::-1]
    
    for idx in range(len(rev_nums)):
        answer += (3 ** idx) * rev_nums[idx]
    return answer