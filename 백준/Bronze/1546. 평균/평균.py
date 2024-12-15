n = int(input())
score = list(map(int, input().split()))

maxNum = max(score)
for i in range(n):
    score[i] = score[i] / maxNum * 100

print(sum(score) / n)