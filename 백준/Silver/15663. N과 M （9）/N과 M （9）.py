import itertools
import sys

n, m = map(int, sys.stdin.readline().split())
number = sorted(list(map(int, sys.stdin.readline().split())))

ans = set()
for i in itertools.permutations(number, m):
    ans.add(i)

for i in sorted(ans):
    print(' '.join(map(str, i)))