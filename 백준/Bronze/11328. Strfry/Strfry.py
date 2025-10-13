t = int(input())
for _ in range(t):
    str_a, str_b = input().split()
    isStrfry = False

    for char in str_a:
        if char in str_b and str_b.count(char) == str_a.count(char):
            isStrfry = True
        else:
            isStrfry = False
            break
    if isStrfry:
        print("Possible")
    else:
        print("Impossible")