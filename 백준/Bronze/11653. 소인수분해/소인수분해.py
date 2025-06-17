n = int(input())
divide = 2
arr = []

while True:

    if n < divide:
        break

    if n % divide == 0:
        arr.append(divide)
        n //= divide
    elif n % divide != 0:
        divide += 1

for i in arr:
    print(i)