from itertools import permutations

n = int(input())
numlist = list(map(int, input().split()))

maxnum = -1
for combi in permutations(numlist, len(numlist)):
    # print(combi)
    sumarr = 0
    for idx in range(1, len(combi)):
        # print(combi[idx], combi[idx - 1])
        sumarr += abs(combi[idx] - combi[idx - 1])
        maxnum = max(sumarr, maxnum)
print(maxnum)