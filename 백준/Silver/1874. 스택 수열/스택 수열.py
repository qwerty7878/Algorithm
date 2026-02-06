import sys
input = sys.stdin.readline

n = int(input())
stack = []
num = 1
ans = []

for i in range(n):
    target = int(input().strip())
    while True:
        if target >= num:
            stack.append(num)
            ans.append('+')
            num += 1
        elif stack:
            if stack[-1] == target:
                stack.pop()
                ans.append('-')
                break
            else:
                ans.append('NO')
                break

if 'NO' in ans:
    print('NO')
else:
    print('\n'.join(ans))