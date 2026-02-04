def solution(nums):
    answer = 0
    totalPocketmon = len(nums) // 2
    pocketmonType = len(set(nums))
    
    answer = min(totalPocketmon, pocketmonType)
    return answer