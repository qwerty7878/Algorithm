t = int(input())

def isCopyNum(n):
    target = n ** 2
    str_target = str(target)
    str_n = str(n)

    back = str_target[len(str_target) -  len(str_n):]
    if back == str_n:
        return True
    else:
        return False

for _ in range(t):
    n = int(input())
    if isCopyNum(n):
        print("YES")
    else:
        print("NO")