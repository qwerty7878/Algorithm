n = int(input())
count = 0
for i in range(n):
    stack = []
    str = input()

    for char in str:
        # 첫글자
        if len(stack) == 0:
            stack.append(char)
        else:
            # 완전히 다른 글자인 경우 happ 'y'
            if char not in stack:
                stack.append(char)
            # 바로 전에 같은 글자 일때 ha p 'p'
            elif stack[-1] == char:
                stack.append(char)
            # 떨어져서 나오는 경우 ab 'a'
            elif stack[-1] != char and char in stack:
                break

        if len(stack) == len(str):
            count += 1

print(count)