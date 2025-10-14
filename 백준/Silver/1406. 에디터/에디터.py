import sys

left_list = list(sys.stdin.readline().strip())
right_list = []
n = int(sys.stdin.readline())

for _ in range(n):
    command = sys.stdin.readline().split()
    if command[0] == 'L':
        if left_list:
            right_list.append(left_list.pop())
    elif command[0] == 'D':
        if right_list:
            left_list.append(right_list.pop())
    elif command[0] == 'B':
        if left_list:
            left_list.pop()
    else:
        left_list.append(command[1])

left_list.extend(reversed(right_list))
print(''.join(left_list))