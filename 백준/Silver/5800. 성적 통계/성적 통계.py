import sys
input = sys.stdin.readline

n = int(input())
for test in range(n):
    scoresWithK = list(map(int, input().split()))
    scores = scoresWithK[1:]
    # print(scores)
    scores.sort()

    maxgap = -1
    for idx in range(1, len(scores)):
        diff = abs(scores[idx] - scores[idx - 1])
        if diff > maxgap:
            maxgap = diff

    print(f"Class {test + 1}")
    print(f"Max {max(scores)}, Min {min(scores)}, Largest gap {maxgap}")