import sys

t = int(sys.stdin.readline().strip())
for i in range(t):
    input = sys.stdin.readline().rstrip()
    print(f"{i + 1}. {input}")