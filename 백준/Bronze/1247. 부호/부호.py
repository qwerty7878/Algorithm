import sys

for _ in range(3):
    s = 0
    t = int(sys.stdin.readline().strip())
    for _ in range(t):
        s += int(sys.stdin.readline().strip())

    if s == 0:
        print(0)
    elif s > 0:
        print('+')
    else:
        print('-')