import sys

n,m = map(int,sys.stdin.readline().split())
neverheard = set()
for i in range(n):
    neverheard.add(sys.stdin.readline().strip())

neverseen = set()
for i in range(m):
    neverseen.add(sys.stdin.readline().strip())

neverSeenAndHear = sorted(neverheard & neverseen)
print(len(neverSeenAndHear))
for i in neverSeenAndHear:
    print(i)