import sys
from itertools import permutations

n, m = map(int, sys.stdin.readline().split())
number = sorted(list(map(int, sys.stdin.readline().split())))

for i in permutations(number, m):
    print(' '.join(map(str, i)))