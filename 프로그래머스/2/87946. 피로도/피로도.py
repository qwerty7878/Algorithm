from itertools import permutations

def solution(k, dungeons):
    answer = -1
    
    for combis in permutations(dungeons, len(dungeons)):
        cnt = 0
        current = k
        for combi in combis:
            if combi[0] > current:
                break
            else:
                current -= combi[1]
                cnt += 1
        if cnt > answer:
            answer = cnt
    return answer