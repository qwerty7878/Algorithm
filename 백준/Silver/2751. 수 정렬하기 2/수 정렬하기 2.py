import sys
input = sys.stdin.readline

n = int(input().strip())
numList = []

for _ in range(n):
    numList.append(int(input().strip()))

numList = sorted(set(numList))
for num in numList:
    print(num)