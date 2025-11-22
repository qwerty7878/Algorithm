import sys

while True:
    input = sys.stdin.readline().strip()
    if input == '0':
        break

    width = len(input) + 1
    for char in input:
        if char == '1':
            width += 2
        elif char == '0':
            width += 4
        else:
            width += 3
    print(width)