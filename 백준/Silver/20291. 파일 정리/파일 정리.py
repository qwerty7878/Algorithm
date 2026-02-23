import sys
from collections import Counter

input = sys.stdin.readline

n = int(input())
files = []

for _ in range(n):
    file = input().strip().split('.')
    files.append(file[1])
# print(files)

count = Counter(files)
# print(count)

for name in sorted(count.keys()):
    print(name, count[name])