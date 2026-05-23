def solution(nums):
    answer = 0
    length = len(nums) // 2
    phoneket = len(set(nums))
    answer = min(length, phoneket)
    return answer