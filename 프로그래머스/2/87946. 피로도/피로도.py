from itertools import permutations

def solution(k, dungeons):
    answer = -1
    for combi in permutations(dungeons, len(dungeons)):
        # print(combi)
        count = 0
        hp = k
        for standard, consumption in combi:
            # print(standard)
            if hp >= standard:
                hp -= consumption
                count += 1
            else:
                break
        # print(count)
        answer = max(answer, count)
    return answer