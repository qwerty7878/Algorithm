import sys
input = sys.stdin.readline

n = int(input())
p = 'I' + ('OI' * n)

m = int(input())
s = input()

count = 0
for idx in range(len(s) - len(p) + 1):
    # print(s[idx:idx + len(p)])
    target = s[idx:idx + len(p)]

    if target == p:
        count += 1
print(count)