import math
import sys

n = int(sys.stdin.readline())

tree = []
for i in range(n):
    tree.append(int(sys.stdin.readline()))

diff = tree[1] - tree[0]
for i in range(2,len(tree)):
    diff = math.gcd(diff, tree[i] - tree[i - 1])

print((tree[-1] - tree[0]) // diff - (n - 1))