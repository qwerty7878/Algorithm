t = int(input())

for _ in range(t):
    left_list = []
    right_list = []

    l = input()
    for char in l:
        if char == '<':
            if left_list:
                right_list.append(left_list.pop())
        elif char == '>':
            if right_list:
                left_list.append(right_list.pop())
        elif char == '-':
            if left_list:
                left_list.pop()
        else:
            left_list.append(char)

    left_list.extend(reversed(right_list))
    print(''.join(left_list))