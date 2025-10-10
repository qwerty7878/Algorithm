import sys

n = int(sys.stdin.readline())
new_num = ''

for i in range(1, 100001):
    new_num += str(i)
print(new_num.index(str(n)) + 1)