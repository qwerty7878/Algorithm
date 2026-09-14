def check(num):
    if num == 6:
        return 1
    elif num == 5:
        return 2
    elif num == 4:
        return 3
    elif num == 3:
        return 4
    elif num == 2:
        return 5
    else:
        return 6

def solution(lottos, win_nums):
    answer = []
    
#     모두 0인 경우
    if sum(lottos) == 0:
        return [1, 6]
    
    zero = 0
    equal_cnt = 0
    for lotto_num in lottos:
        if lotto_num == 0:
            zero += 1
        elif lotto_num in win_nums:
            equal_cnt += 1
            
    total = equal_cnt + zero
    answer = [check(total), check(equal_cnt)]
    return answer