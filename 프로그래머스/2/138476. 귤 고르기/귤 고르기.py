from collections import Counter

def solution(k, tangerine):
    answer = 0
    count = Counter(tangerine).most_common()
    
    for num, cnt in count:
        # print(num,cnt)
        k -= cnt
        answer += 1
        
        if k <= 0:
            break
    
    return answer