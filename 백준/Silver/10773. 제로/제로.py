import sys
input = sys.stdin.readline

n = int(input())
stack = []
for _ in range(n):
    num = int(input().strip())
    if stack and num == 0:
        stack.pop()
    else:
        stack.append(num)
    # print(stack)
print(sum(stack))