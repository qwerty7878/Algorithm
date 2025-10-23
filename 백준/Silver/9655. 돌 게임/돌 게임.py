n = int(input())
Sang = False

while True:
    if n <= 0:
        break

    if n > 3:
        n -= 3
    else:
        n -= 1
    Sang = not Sang

if Sang:
    print("SK")
else:
    print("CY")