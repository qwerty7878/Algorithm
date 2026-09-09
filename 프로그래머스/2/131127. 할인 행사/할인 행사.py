def solution(want, number, discount):
    answer = 0
    
    for day in range(len(discount) - 10 + 1):
        temp = number.copy()
        # print(temp)
        for idx in range(day, day + 10):
            # print(temp, discount[idx], day)
            if discount[idx] in want:
                # print(want.index(discount[idx]))
                if temp[want.index(discount[idx])] != 0:
                    temp[want.index(discount[idx])] -= 1
                    
                if sum(temp) == 0:
                    answer += 1
            else:
                break
    return answer