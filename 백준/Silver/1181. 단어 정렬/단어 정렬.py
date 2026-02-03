import sys
input = sys.stdin.readline

n = int(input())
numList = []
for _ in range(n):
    numList.append(input().strip())
numList = sorted(list(set(numList)))
numList.sort(key=len)
# print(numList)

for word in numList:
    print(word)