import sys

s = sys.stdin.readline().strip()
arr = set()

for i in range(len(s) + 1):
    for j in range(len(s) + 1):
        if s[i:j] != '':
            arr.add(s[i:j])
print(len(arr))