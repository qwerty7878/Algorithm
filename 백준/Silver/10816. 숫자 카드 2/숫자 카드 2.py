import sys
from collections import Counter

m = int(sys.stdin.readline())
cardA = list(map(int, sys.stdin.readline().split()))
n = int(sys.stdin.readline())
cardB = list(map(int, sys.stdin.readline().split()))

counter = Counter(cardA)
for i in range(n):
    cardB[i] = counter[cardB[i]]
print(*cardB)