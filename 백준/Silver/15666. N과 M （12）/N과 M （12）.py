import itertools
import sys

n, m = map(int, sys.stdin.readline().split())
number = sorted(set(list(map(int, sys.stdin.readline().split()))))

data = itertools.combinations_with_replacement(number, m)
for i in data:
    print(' '.join(map(str, i)))