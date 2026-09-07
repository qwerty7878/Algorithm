from collections import Counter

def solution(k, tangerine):
    answer = 0
    counter = Counter(tangerine)
    # print(counter)
    
    temp = []
    for cnt in counter.values():
        temp.append(cnt)
        
    sorted_temp = sorted(temp, reverse=True)
    for num in sorted_temp:
        if k <= 0:
            break
        else:
            k -= num
            answer += 1
    return answer