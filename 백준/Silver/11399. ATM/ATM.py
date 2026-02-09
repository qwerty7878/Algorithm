import sys
input = sys.stdin.readline

n = int(input())
line = list(map(int, input().split()))
line.sort()

prefixSum = [0] * n
prefixSum[0] = line[0]
for idx in range(1, len(line)):
    prefixSum[idx] = prefixSum[idx - 1] + line[idx]
print(sum(prefixSum))