str = input()
stack = []
line_cnt = 0

for idx in range (len(str)):
    if str[idx] == '(':
        stack.append(str[idx])
    else:
        if str[idx-1] == '(':
            stack.pop()
            line_cnt += len(stack)
        else:
            stack.pop()
            line_cnt += 1
print(line_cnt)